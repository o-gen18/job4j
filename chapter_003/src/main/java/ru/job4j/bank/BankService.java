package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void add(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!(users.get(user).contains(account))) {
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(each -> each.getPassport().equals(passport))
                .findFirst()
                .get();
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user != null) {
            account = users.get(user).stream()
                    .filter(each -> each.getRequisite().equals(requisite))
                    .findFirst()
                    .get();
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account userDonor = findByRequisite(srcPassport, srcRequisite);
        Account userAcceptor = findByRequisite(destPassport, destRequisite);
        if (!((userDonor == null) && (userAcceptor == null))) {
            result = userDonor.transfer(userAcceptor, amount);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}

package ru.job4j.bank;

import java.util.*;

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
        User user = null;
        for (User pass : users.keySet()) {
            if (passport.equals(pass.getPassport())) {
                user = pass;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user != null) {
            for (Account usersaccount : users.get(user)) {
                if (usersaccount.getRequisite().equals(requisite)) {
                    account = usersaccount;
                    break;
                }
            }
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

package ru.job4j.bank;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.add(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Pert Arsentev");
        BankService bank = new BankService();
        bank.add(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150.0));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Pert Arsentev");
        BankService bank = new BankService();
        bank.add(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        bank.addAccount(user.getPassport(), new Account("114", 50));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "114", 150);
        assertThat(bank.findByRequisite("3434", "114").getBalance(), is(200.0));
    }
}

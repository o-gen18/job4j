package ru.job4j.bank;

import java.util.Objects;

public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean transfer(Account destination, double amount) {
        boolean result = false;
        if (this.balance >= amount) {
            this.balance -= amount;
            destination.setBalance(destination.getBalance() + amount);
            result = true;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

}

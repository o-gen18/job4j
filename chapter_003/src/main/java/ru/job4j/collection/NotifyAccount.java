package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> send(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account person : accounts) {
            rsl.add(person);
        }
        return rsl;
    }
}

package ru.job4j.collection;

import java.util.Comparator;

public class UserDescByNameDown implements Comparator<User> {
    @Override
    public int compare(User first, User second) {
        return second.compareTo(first);
    }
}

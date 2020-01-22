package ru.job4j.collection;

import java.util.Comparator;

public class UserDescByAgeDown implements Comparator<User> {
    @Override
    public int compare(User first, User second) {
        return Integer.compare(second.getAge(), first.getAge());
    }
}

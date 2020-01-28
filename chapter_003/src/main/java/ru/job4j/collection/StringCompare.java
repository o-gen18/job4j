package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int result = first.length() - second.length();
        int minLength = Math.min(first.length(), second.length());
        for (int i = 0; i < minLength; i++) {
            char c1 = first.charAt(i);
            char c2 = second.charAt(i);
            if (c1 != c2) {
                result = c1 - c2;
                break;
            }
        }
        return result;
    }
}

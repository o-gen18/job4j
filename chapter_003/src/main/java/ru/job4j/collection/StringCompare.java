package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = left.length() - right.length();
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength; i++) {
            char c1 = left.charAt(i);
            char c2 = right.charAt(i);
            if (c1 != c2) {
                result = c1 - c2;
                break;
            }
        }
        return result;
    }
}

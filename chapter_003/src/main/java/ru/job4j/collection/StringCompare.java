package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int result = 0;
        int limit = first.length();
        for (int i = 0; i < limit; i++) {
            if ( limit <= second.length() ) {
                result += Character.compare(first.charAt(i), second.charAt(i));
                if (limit - i == 1) {
                    result += Integer.compare(first.length(), second.length());
                } else {
                    result = result + 0;
                }
            } else {
                limit = second.length();
                i--;
            }
        }
        return result;
    }
}

package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int i = 0;
        if (left.length() > right.length()) {
            for (int index = 0; index < right.length(); index++) {
                if (right.charAt(index) < left.charAt(index)) {
                    i = 1;
                    break;
                } else if (right.charAt(index) > left.charAt(index)) {
                    i = -1;
                    break;
                } else i = 1;
            }
        } else if (left.length() < right.length()) {
            for (int index = 0; index < left.length(); index++) {
                if (left.charAt(index) > right.charAt(index)) {
                    i = 1;
                    break;
                } else if (left.charAt(index) < right.charAt(index)) {
                    i = -1;
                    break;
                } else i = -1;
            }
        } else {
            for (int index = 0; index < left.length(); index++) {
                    if (left.charAt(index) > right.charAt(index)) {
                        i = 1;
                        break;
                    } else if (left.charAt(index) < right.charAt(index)) {
                        i = -1;
                        break;
                    }
            }

        }
        return i;
    }
}

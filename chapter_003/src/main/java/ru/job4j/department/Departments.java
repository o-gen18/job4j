package ru.job4j.department;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start = start + el + "/";
            }
        }
        ArrayList rsl = new ArrayList<>(tmp);
        Collections.sort(rsl);
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescCompDown());
    }


    public static class DepDescCompDown implements Comparator<String> {
        @Override
        public int compare(String first, String second) {
            int result = first.length() - second.length();
            int minLength = Math.min(first.length(), second.length());
            for (int i = 0; i < minLength; i++) {
                char c1 = first.charAt(i);
                char c2 = second.charAt(i);
                if (c1 != c2) {
                    result = c2 - c1;
                    break;
                }
            }
            return result;
        }
    }
}

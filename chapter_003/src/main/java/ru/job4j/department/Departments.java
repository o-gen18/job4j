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
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
//        String[] array = new String[orgs.size()];
//        for (int i = 0; i < orgs.size()-1; i++) {
//            array[i].compareTo(array[i+1]);
//        }
//        Comparator<String> secondStep = Comparator.naturalOrder();
//        Comparator<String> reverse = Comparator.reverseOrder();
        Collections.sort(orgs, new DepDescCompDown().thenComparing(Comparator.naturalOrder()));
    }
//        ArrayList<String> tmplist = new ArrayList<String>();
//        int i = 1;
//        for (String value : orgs) {
//            String start = "";
//            Comparator tmpCmp;
//            if ( i > 0 ) {
//                tmpCmp = Comparator.reverseOrder();
//            } else {
//                tmpCmp = Comparator.naturalOrder();
//            }
//            Collections.sort(orgs, tmpCmp);
//            i *= -1;
//        }

    public static class DepDescCompDown implements Comparator<String> {
        @Override
        public int compare(String first, String second) {
            return second.compareTo(first);
        }
    }
}

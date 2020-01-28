package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String word : origin) {
            check.add(word);
        }
        for (int i = 0; i < check.size(); i++) {
            if (!(check.contains(duplicate[i]))) {
                rsl = false;
            }
            break;
        }
        return rsl;
    }
}


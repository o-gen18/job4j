package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int result = 0;
        if ( first.length() < second.length() ) {
            for ( int i = 0; i < first.length(); i++ ) {
               result = Character.compare(first.charAt(i), second.charAt(i));
               if ( result != 0 ) break;
            }
            if ( result == 0 ) {
                result = Integer.compare(first.length(), second.length());
            }
        } else {
            for ( int i = 0; i < second.length(); i++ ) {
                result = Character.compare(first.charAt(i), second.charAt(i));
                if ( result != 0 ) break;
            }
            if ( result == 0 ) {
                result = Integer.compare(first.length(), second.length());
            }
        }
        return result;
    }
}

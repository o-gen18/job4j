package ru.job4j.collection;

import java.util.HashMap;

public class UsageHashMap {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("oggen18@gmail.com", "Oleg Oleg Aleksandrovish");
        for (String key : myMap.keySet()) {
            String value = myMap.get(key);
            System.out.println(key + " = " + value);
        }
    }
}

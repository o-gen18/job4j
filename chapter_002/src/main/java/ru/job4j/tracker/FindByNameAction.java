package ru.job4j.tracker;

import java.util.ArrayList;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter Name: ");
        String name = input.askStr("");
        ArrayList<Item> result = tracker.findByName(name);
        System.out.println("Here are matches found: ");
        for (Item element : result) {
            System.out.println("Item: " + element.getName() + "   -   id: " + element.getId());
        }
        return true;
    }
}

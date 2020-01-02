package ru.job4j.tracker;

import java.util.ArrayList;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        ArrayList<Item> result = tracker.findAll();
        for (Item element : result) {
            System.out.println("Item: " + element.getName() + "  -  Id: " + element.getId());
        }
        return true;
    }
}

package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter Name: ");
        String name = input.askStr("");
        Item[] result = tracker.findByName(name);
        System.out.println("Here are matches found: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Item: " + result[i].getName() + "   -   id: " + result[i].getId());
        }
        return true;
    }
}

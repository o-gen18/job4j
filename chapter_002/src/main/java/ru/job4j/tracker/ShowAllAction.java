package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        for (int i = 0; i < result.length; i++) {
            System.out.println("Item: " + result[i].getName() + "  -  Id: " + result[i].getId());
        }
        return true;
    }
}

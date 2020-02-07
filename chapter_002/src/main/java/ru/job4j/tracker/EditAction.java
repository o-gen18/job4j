package ru.job4j.tracker;

import java.util.function.Consumer;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        output.accept("Enter id: ");
        String id = input.askStr("");
        output.accept("Enter new name: ");
        Item item = new Item(input.askStr(""));
        if (tracker.replace(id, item)) {
            output.accept("The item has been replaced with this new one: " + item.getName() + "\r\n");
        } else {
            output.accept("There has been no items found with this id: " + id + "\r\n");
        }
        return true;
    }
}

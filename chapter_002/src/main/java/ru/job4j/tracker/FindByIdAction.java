package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter id: ");
        String id = input.askStr("");
        System.out.println("Here is your item: " + tracker.findById(id).getName() + "\r\n");
    return true;
    }
}

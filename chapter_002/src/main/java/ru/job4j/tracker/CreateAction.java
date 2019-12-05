package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create a new Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Your Item has been created. Get your id: " + item.getId() + "\r\n");
        return true;
    }
}

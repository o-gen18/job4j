package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter id: ");
        String id = input.askStr("");
        System.out.println("Enter new name: ");
        Item item = new Item(input.askStr(""));
        if (tracker.replace(id, item)) {
            System.out.println("The item has ben replaced with this new one: " + item.getName() + "\r\n");
        } else {
            System.out.println("There has been no items found with this id: " + id + "\r\n");
        }
        return true;
    }
}

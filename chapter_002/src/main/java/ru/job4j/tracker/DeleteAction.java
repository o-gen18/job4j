package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Enter id: ");
        String id = input.askStr("");
        if (tracker.delete(id)) {
            System.out.println("The item has been successfully deleted\r\n");
        } else {
            System.out.println("There has been no items found with this id: " + id + "\r\n");
        }
        return true;
    }
}

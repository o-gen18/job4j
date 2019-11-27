package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.print("Your item has been created. Get your Id: " + item.getId() + "\r\n");
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] result = tracker.findAll();
                for (int i = 0; i < result.length; i++) {
                    System.out.println("Item: " + result[i].getName() + "  -  " + "Id: " + result[i].getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Enter Id: ");
                String id = scanner.nextLine();
                System.out.println("Enter new name: ");
                Item item = new Item(scanner.nextLine());
                if (tracker.replace(id, item)) {
                    System.out.println("The item has been replaced with this new one: " + item.getName());
                } else {
                    System.out.print("There has been no items found by this id: " + id + "\r\n");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("The item has been successfully deleted");
                } else {
                    System.out.println("There has been no items found by this id: " + id + "\r\n");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.println("Enter Id: ");
                String id = scanner.nextLine();
                System.out.print("Here is your item: " + tracker.findById(id).getName() + "\r\n");
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] result = tracker.findByName(name);
                System.out.println("Here are matches found: ");
                for (int i = 0; i < result.length; i++) {
                    System.out.println("Item: " + result[i].getName() + "  -  " + "Id: " + result[i].getId());
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

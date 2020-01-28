package ru.job4j.heritage;

public class Predator extends Animal {
    Predator name = new Predator("Predator");

    public Predator(String name) {
        super(name);
    }

    public Predator() {
        super();
        System.out.println("load Predator");
    }
}

package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("X\n\r");
        sb.append("XX\n\r");
        sb.append("XXX\n\r");
        sb.append("XXXX\n\r");
        return sb.toString();
    }
}
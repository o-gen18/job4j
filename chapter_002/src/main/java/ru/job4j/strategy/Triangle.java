package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("X"+ System.lineSeparator());
        sb.append("XX"+ System.lineSeparator());
        sb.append("XXX" + System.lineSeparator());
        sb.append("XXXX" + System.lineSeparator());
        return sb.toString();
    }
}
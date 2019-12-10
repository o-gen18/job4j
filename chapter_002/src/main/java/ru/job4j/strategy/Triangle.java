package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("X");
        sb.append(System.lineSeparator());
        sb.append("XX");
        sb.append(System.lineSeparator());
        sb.append("XXX");
        sb.append(System.lineSeparator());
        sb.append("XXXX");
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
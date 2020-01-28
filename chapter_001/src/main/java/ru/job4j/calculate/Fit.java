package ru.job4j.calculate;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(175);
        double woman = womanWeight(150);
        System.out.println("Идеальный вес мужчины при росте 175см = " + man + "кг");
        System.out.println("Идеальный вес женщины при росте 150см = " + woman + "кг");
    }
}
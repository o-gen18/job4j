package ru.job4j.calculate;

public class Fit2 {
    public static void man(double height){
        double weight = (height-100)*1.15;
        System.out.println("Идеальный вес мужчины при росте " + height + "см = " + weight + "кг");
    }
    public static void woman(double height){
        double weight = (height-110)*1.15;
        System.out.println("Идеальный вес женщины при росте " + height + "см = " + weight + "кг");
    }
   public static void main(String[]args) {
        man(175);
        woman(150);
   }
}

package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value){
        return value / 70;
    }
    public static double rubleToDollar(double value){
        return value / 60;
    }
    public static int euroToRuble(int value){
        return value*70;
    }
    public static int dollarToRuble(int value){
        return value*60;
    }
    public static void main(String[]args){
        int euro = rubleToEuro(140);
        double dollar = rubleToDollar(140);
        int rubleFromEuro = euroToRuble(4);
        int rubleFromDollar = dollarToRuble(7);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar");
        System.out.println("4 euros are " + rubleFromEuro + " rubles");
        System.out.println("7 dollars are " + rubleFromDollar + " rubles");
    }
}

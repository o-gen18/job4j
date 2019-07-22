package ru.job4j.calculate;

public class Calculator {
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }
    public static void div(double first, double second) {
        double result = first/second;
        System.out.println(first + "/" + second + "=" + result);
    }
    public static void multiply(double first, double second) {
        double result = first*second;
        System.out.println(first + "*" + second + "=" + result);
    }
    public static void subtrack(double first, double second){
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }
    public static void main(String[]args){
        add(1, 1);
        add(2, 2);
        div(7, 2);
        multiply(3, 4);
        subtrack(8, 3);
    }
}

package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){
        double x=x2-x1;
        double y=y2-y1;
        double first=Math.pow(x,2);
        double second=Math.pow(y,2);
        return Math.sqrt(first+second);
    }
    public static void main(String[]args){
        double result = distance(8,11,11,15);
        System.out.println("Расстояние от точки (8,11) до точки (11,15) равно " + result);
        double result2 = distance(7,10,9,14);
        System.out.println("Расстояние от точки (7,10) до точки (9,14) равно " + result2);
        double result3 = distance(22,33,44,66);
        System.out.println("Расстояние от точки (22,33) до точки (44,66) равно " + result3);

    }
}

package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    /**
     * Это поля объекта. Они доступно только конкретному объекту
     */
    private int x;
    private int y;

    public Point(int first, int second){ //Создаётся конструктор для инициализации начального состояния
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) { // Метод принимает переменную типа Point, имеющую 2 параметра, приравниваемы соответственно к x и y
        return sqrt(pow(this.x-that.x, 2) + pow(this.y-that.y, 2));
    }
    public static void main(String[] args){
        Point a = new Point(0, 0);
        Point b = new Point(5, 5);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}

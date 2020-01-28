package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        //Создаём объект класса Car.
        Car car = new Car();
        //Делаем приведение к типу родителя Transport.
        Transport tr = car;
        //Делаем приведение к типу родителя Object.
        Object ob = car;
        //Приведение типа при создании объекта.
        Object ocar = new Car();
        //Приведение типа за счёт повышения по иерархии.
        Car carFromJbject = (Car) ocar;

        //Ошибка в приведении типа.
        Object bicycle = new Bycicle();
        Car cb = (Car) bicycle; //код завершится с ошибкой приведения типов ClassCastException
    }
}

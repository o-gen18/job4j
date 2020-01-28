package ru.job4j.oop;

//public class Cat {
//}                   //Это код класса Cat

/**
 * создадим класс Dog в него добавим
 * особый метод main и в нём создадим ОБЪЕКТ класса Dog
 */
public class Dog {
    public static void main(String[] args) {
        Dog polkan = new Dog(); //Создаётся переменная типа Dog с именем polkan
        // далее мы записываем эту переменную в ОБЪЕКТ типа Dog.
        //Оператор new резервирует кусок памяти и записывает в неё данные ОБЪЕКТА класса Dog

        Dog sharik = new Dog();
        Dog zhuchka = new Dog();
        //Здесь уже 3 переменные класса Dog коотрые содержат разные области памяти.
    }
}

package ru.job4j.heritage;

/**
 * 1. Создайте три класса Animal >Predator > Tiger.
 * 2. В каждом классе создайте контруктор без параметров.
 * В каждом конструкторе сделайте вызов конструктора родителя и вывод на консоль имени класса.
 */
public class Animal {
    private String name;  //добавил поле name которое инициализируется через конструктор

    public Animal(String name) {
        this.name = name;
    }

    String i = "эта строковая переменная лежит в пером суперклассе Animal, но вызывается последним подклассом, так как она ему доступна,"
            + "если конечно не объявлена с модификатором privatе.";

    public Animal() {
        super();
        System.out.println("load Animal");
    }
}

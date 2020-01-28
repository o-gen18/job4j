package ru.job4j.io;
import java.util.Scanner;

/**
 * Задание
 * В этом задании вам необходимо сделать игру 11. Смысл игры в следующем. На столе лежат 11 спичек.
 * Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.
 * 1. Создайте класс ru.job4j.io.Matches с методом main.
 * 2. В методе main добавьте цикл. Игра заканчивается, когда игрок забрал последние спички.
 * В цикле нужно проверять количество спичек.
 * 3. Сделайте ввод данных от пользователя. По порядку. Сначала первый игрок вводит число от 1 до 3,
 * потом второй и так далее.
 * Когда игрок ввел цифру, нужно показать сколько спичек осталось на столе.
 */
public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        Scanner input = new Scanner(System.in);
        System.out.println("На столе " + matches + " спичек. Введите число :)");
        while (matches > 1) {
            matches = matches - Integer.valueOf(input.nextLine());
            if (matches < 1) {
                break;
            }
            System.out.println("На столе теперь " + matches + " спичек");
        }
        System.out.println("Вы выйграли, забрав последнюю спичку! :)");
    }
}
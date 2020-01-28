package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;

/**
 * В этом задании нужно реализовать предсказателя. Пользователь вводит вопрос,
 * программа генерирует случайное число и выводит ответ на вопрос пользователя: да, нет, может быть.
 *  1 Создайте класс ru.job4j.io.MagicBall.
 *  2 Создайте в нем метод main. В нем попросите пользователя ввести закрытый вопрос.
 *  Это вопрос на который можно ответить либо да, либо нет.
 *  3 В методе main должен быть объект Scanner для ввода вопроса от пользователя.
 *  4 Через класс Random сгенерируйте число от 0 до 3. Ниже приведён код, как это можно сделать.
 *  Если ответ равен 0, то на консоль нужно вывести "Да". Если ответ - 1, то на консоль нужно вывести "Нет".
 *  Во всех остальных случаях напечатать - "Может быть".
 */

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать?");
        int answer = new Random().nextInt(3);
        String ask = input.nextLine();
        if (answer == 0) {
            System.out.print(" Да!");
        } else if (answer == 1) {
            System.out.print(" Нет!");
        } else {
            System.out.print(" Может быть...");
        }
    }
}

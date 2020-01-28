package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегуут неуклюже"
                    + " пешеходы по лужам...");
        } else if (position == 2) {
            System.out.println("Спокойной ночи......");
        } else {
            System.out.println("Песеня не найдена!");
        }
    }

    public static void main(String[] args) {
        Jukebox trial = new Jukebox();
        trial.music(1);
        trial.music(2);
        trial.music(11);

    }
}

package ru.job4j.listtomap;

import java.util.Objects;


public class Student2 {
    private String name;
    private String surname;
    private int score;

    public Student2(String name, String surname, int score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Name - " + name + ", surname - " + surname + ", score = " + score;
    }

    @Override
    public boolean equals(Object o) {
        if (this ==o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student2 student = (Student2) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname)
                && Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, score);
    }
}

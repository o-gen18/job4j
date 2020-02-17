package ru.job4j.jdk9;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;


public class StudentstreamTest {
    @Test
    public void whenGetStudentsWithScoreMoreThen60() {
        List<Student> students = Arrays.asList(new Student("Ivan", 10),
                null,
                new Student("Nikolay", 20),
                null,
                new Student("Sergei", 30),
                null,
                new Student("Vika", 40),
                null,
                new Student("Kristina", 50),
                null,
                new Student("Andrey", 60),
                null,
                new Student("Pavel", 70),
                null,
                new Student("Olga", 80),
                null,
                new Student("Vasiliy", 90));
        List<Student> result = new Studentstream().levelOf(students, 60);
        List<Student> expected = Arrays.asList(new Student("Vasiliy", 90),
                new Student("Olga", 80),
                new Student("Pavel", 70),
                new Student("Andrey", 60));
        assertThat(result, is(expected));
    }
}

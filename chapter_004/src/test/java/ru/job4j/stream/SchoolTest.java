package ru.job4j.stream;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SchoolTest {
    @Test
    public void whenAClassRequired() {
        List<Student> students = List.of(
                new Student(10),
                new Student(30),
                new Student(50),
                new Student(70),
                new Student(90),
                new Student(100));
        School school = new School();
        List<Student> result = school.collect(students, iif ->  (((iif.getScore() > 70) && (iif.getScore() <= 100))));
        List<Student> expected = List.of(new Student(90), new Student(100));
        assertThat(result, is(expected));
        }

    @Test
    public void whenBClassRequired() {
        List<Student> students = List.of(
                new Student(10),
                new Student(30),
                new Student(50),
                new Student(70),
                new Student(90),
                new Student(100));
        School school = new School();
        List<Student> result = school.collect(students, iif ->  (((iif.getScore() > 50) && (iif.getScore() <= 70))));
        List<Student> expected = List.of(new Student(70));
        assertThat(result, is(expected));
    }

    @Test
    public void whenCClassRequired() {
        List<Student> students = List.of(
                new Student(10),
                new Student(30),
                new Student(50),
                new Student(70),
                new Student(90),
                new Student(100));
        School school = new School();
        List<Student> result = school.collect(students, iif ->  (((iif.getScore() > 0) && (iif.getScore() <= 50))));
        List<Student> expected = List.of(new Student(10), new Student(30), new Student(50));
        assertThat(result, is(expected));
    }
}


package ru.job4j.lambda;

import org.junit.Test;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class GroupTest {
    @Test
    public void whenStudentsGroupedBySections() {
        List<Student> students = List.of(new Student("Vika", Set.of("Painting", "Swimming", "Reading")),
                new Student("Stepan", Set.of("Reading", "Karate", "Football")),
                new Student("Ivan", Set.of("Basketball")),
                new Student("Sveta", Set.of("Swimming", "Cooking")),
                new Student("Vladimir", Set.of("Karate", "Swimming")),
                new Student("Kristina", Set.of("Football", "Cooking")),
                new Student("Denis", Set.of()));
        Map<String, Set<String>> result = new Group().sections(students);
        Map<String, Set<String>> expected = Map.of("Painting", Set.of("Vika"), "Swimming", Set.of("Vika", "Sveta", "Vladimir"),
                "Reading", Set.of("Stepan", "Vika"), "Karate", Set.of("Vladimir", "Stepan"), "Football", Set.of("Kristina", "Stepan"),
                "Basketball", Set.of("Ivan"), "Cooking", Set.of("Sveta", "Kristina"));
        assertThat(result, is(expected));
    }
}

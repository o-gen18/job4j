package ru.job4j.stream;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
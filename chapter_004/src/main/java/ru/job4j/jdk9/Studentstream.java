package ru.job4j.jdk9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Studentstream {
    public List<Student> levelOf(List<Student> students, int bound) {
        List<Student> list = students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .takeWhile(st -> st.getScore() >= bound)
                .collect(Collectors.toList());
        return list;
    }
}

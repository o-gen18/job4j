package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public List<Integer> matrixToList(Integer[][] matrix) {
        List<Integer> list = Stream.of(matrix).flatMap(Stream::of).collect(Collectors.toList());
        return list;
    }
}

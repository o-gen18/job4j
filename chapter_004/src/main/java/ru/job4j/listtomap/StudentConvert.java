package ru.job4j.listtomap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentConvert {
    public Map<String, Student2> studentListToMap(List<Student2> students) {
        Map<String, Student2> studentsMap = students
                .stream()
                .distinct()
                .collect(Collectors.toMap(e -> e.getSurname(), e -> e));
        return studentsMap;
    }
}

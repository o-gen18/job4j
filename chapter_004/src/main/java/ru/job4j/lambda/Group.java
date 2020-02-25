package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap(st -> st.getUnits().stream().map(section -> new Holder(section, st.getName())))
                .collect(Collectors.groupingBy(ho -> ho.section,
                        Collector.of(HashSet::new, (set, el) -> set.add(el.nameOfStudent), (left, right) -> {
                        left.addAll(right); return left;
                })));
    }

    static class Holder {
        String section;
        String nameOfStudent;

        Holder(String section, String nameOfStudent) {
            this.section = section;
            this.nameOfStudent = nameOfStudent;
        }
    }
}

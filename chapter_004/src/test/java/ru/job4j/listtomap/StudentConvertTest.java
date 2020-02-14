package ru.job4j.listtomap;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StudentConvertTest {
    @Test
    public void whenStudentsListConvertToMap() {
        List<Student2> list = List.of(new Student2("Ivan","Petrov",34),
                new Student2("Sergei", "Aleksandrov", 76),
                new Student2("Denis", "Uskov", 40),
                new Student2("Vladimir", "Sidorov", 87));
        StudentConvert studentList = new StudentConvert();
        Map<String, Student2> result = studentList.studentListToMap(list);
        Map<String, Student2> expected = new HashMap<>();
        expected.put("Petrov", new Student2("Ivan","Petrov",34));
        expected.put("Aleksandrov", new Student2("Sergei","Aleksandrov",76));
        expected.put("Denis", new Student2("Denis","Uskov",40));
        expected.put("Vladimir", new Student2("Vladimir","Sidorov",87));
        boolean compare = result.equals(expected);
        assertThat(compare, is(true));
    }
}

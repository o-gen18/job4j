package ru.job4j.department;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class DepDescCompTest {
    @Test
    public void compare() {
        int rsl = new Departments.DepDescCompDown().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, lessThan(0));
    }
}

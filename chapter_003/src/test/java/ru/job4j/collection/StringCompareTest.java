package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;


public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare("Ivanov", "Ivanov");
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShoulBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare("Ivanov", "Ivanova");
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Petrov", "Ivanova");
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Petrov", "Patrov");
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare("Patrova", "Petrov");
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenRightLessThanLeftResultShoulBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare("Ivanova", "Ivanov");
        assertThat(rst, greaterThan(0));
    }


}

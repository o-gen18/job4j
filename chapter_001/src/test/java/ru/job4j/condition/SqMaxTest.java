package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SqMaxTest {
    @Test
    public void findTheMaxOfFour1() {
        SqMax check = new SqMax();
        int result = check.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void findTheMaxOfFour2() {
        SqMax check = new SqMax();
        int result = check.max(22, 22, 123, -16);
        assertThat(result, is(123));
    }

    @Test
    public void findTheMaxOfFour3() {
        SqMax check = new SqMax();
        int result = check.max(0, 32, 98, 98);
        assertThat(result, is(98));
    }

    @Test
    public void findTheMaxOfFour4() {
        SqMax check = new SqMax();
        int result = check.max(321, 321, 321, 22);
        assertThat(result, is(321));
    }

    @Test
    public void findTheMaxOfFour5() {
        SqMax check = new SqMax();
        int result = check.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void findTheMaxOfFour6() {
        SqMax check = new SqMax();
        int result = check.max(4, 32, 2, 1);
        assertThat(result, is(32));
    }
}

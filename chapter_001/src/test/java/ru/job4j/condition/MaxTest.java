package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then1(){
        Max max = new Max();
        int result = max.max(33,22);
        assertThat(result,is(33));
    }
    @Test
    public void whenMax2To1Then2(){
        Max max = new Max();
        int result = max.max(44,70);
        assertThat(result, is(70));
    }
    @Test
    public void whenBothEqual(){
        Max max = new Max();
        int result = max.max(67,67);
        assertThat(result, is(67));
    }
}

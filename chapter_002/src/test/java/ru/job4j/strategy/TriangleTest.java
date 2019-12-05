package ru.job4j.strategy;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                        .append("X\n\r")
                        .append("XX\n\r")
                        .append("XXX\n\r")
                        .append("XXXX\n\r")
                        .toString()
                )
        );
    }
}

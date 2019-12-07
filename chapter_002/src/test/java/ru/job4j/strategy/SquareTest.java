package ru.job4j.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Oleg Generalov (oggen18@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("-----")
                        .add("|     |")
                        .add("|     |")
                        .add("_____")
                        .toString()
                )
        );
    }
}

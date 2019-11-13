package ru.job4j.condition;

import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when5and5() {
        double expected = 7.071;
        double result = Point.distance(0, 0, 5, 5);
        Assert.assertThat(result,closeTo(expected,0.001));
    }
}


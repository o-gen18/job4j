package ru.job4j.condition;

import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
   public void when5and5() {
       double expected = 7.071;
       Point a = new Point(0,0);
       Point b = new Point(5,5);
       double result = a.distance(b);
       Assert.assertThat(result,closeTo(expected,0.001));
    }
    @Test
    public void when5and5and5() {
        double expected = 8.660;
        Point a = new Point(0,0,0);
        Point b = new Point(5,5,5);
        double result = a.distance3d(b);
        Assert.assertThat(result, closeTo(expected, 0.001));
    }
}


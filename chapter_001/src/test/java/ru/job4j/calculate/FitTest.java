package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void whenManHeightis175() {
        double expected = 86.25;
        double out = Fit.manWeight(175);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeightis150() {
        double expected = 46;
        double out = Fit.womanWeight(150);
        Assert.assertEquals(expected, out, 0.01);
    }
}

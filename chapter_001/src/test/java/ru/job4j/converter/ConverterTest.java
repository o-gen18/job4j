package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro(){
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void rubleToDollar(){
        double in = 180;
        int expected = 3;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected,out,0.0000001);
    }
}

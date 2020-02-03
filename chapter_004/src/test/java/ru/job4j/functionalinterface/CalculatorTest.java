package ru.job4j.functionalinterface;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAdd1Until3() {
        Calculator calc = new Calculator();
        List<Double> buffer= new ArrayList<>();
        calc.multiply(1, 4, 1, (value, index) -> (double) value * index,
                result -> buffer.add(result));
        assertThat(buffer, is(Arrays.asList(1D, 2D, 3D)));
    }
}

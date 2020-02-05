package ru.job4j.functionalinterface;

import org.junit.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class DiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = Diapason.diapason(3, 6, x -> x * x);
        List<Double> expected = Arrays.asList(9D, 16D, 25D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLog3FunctionThenLogResults() {
        List<Double> result = Diapason.diapasonForLogFunc(1, 82, 3, (x, baseOfLog) -> {
            double y = 0 + Diapason.z;      //Создаём статическое поле z в основном классе, в него будем сохранять значение y, и при каждом проходе по циклу будем присваивать обратно
            if (!(Math.pow(baseOfLog, y) == x)) {
                y = 0;      //Если проверка не сработала, обнуляем y и запускаем новый цикл в котором будем делить значение х на основание логарифма до тех пор пока дойдём до него
                for (double i = x; i < baseOfLog; i /= baseOfLog) {
                    y += 1;
                }
                y += 1;     //когда цикл остановится нужно ещё итеировать y на единицу чтобы засчитать и последнее деление на основание логарифма
            }
            Diapason.z = y;
            return Diapason.z++;
        });
        Diapason.z = 0;
        List<Double> expected = Arrays.asList(0D, 1D, 2D, 3D, 4D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLog2FunctionThenLogResults() {
        List<Double> result = Diapason.diapasonForLogFunc(1, 9, 2, (x, baseOfLog) -> {
            double y = 0 + Diapason.z;
            if (!(Math.pow(baseOfLog, y) == x)) {
                y = 0;
                for (double i = x; i < baseOfLog; i /= baseOfLog) {
                    y += 1;
                }
                y += 1;
            }
            Diapason.z = y;
            return Diapason.z++;
        });
        Diapason.z = 0;
        List<Double> expected = Arrays.asList(0D, 1D, 2D, 3D);
        assertThat(result, is(expected));
    }
}

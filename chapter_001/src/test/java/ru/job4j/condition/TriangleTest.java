package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea(){
        //Создание обьекта треугольника.
        Triangle triangle = new Triangle();
        //Вычисяем плщадь.
        double result = triangle.area(0,0,0,3,4,0);
        //Задаем ожидаемый результат
        double expected = 6;
        //Сравниваем результат с ожидаемым
        assertThat(result,closeTo(expected, 0.1));
    }

}

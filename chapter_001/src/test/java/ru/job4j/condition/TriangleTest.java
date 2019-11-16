package ru.job4j.condition;
import ru.job4j.condition.Point;
import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
   @Test
    public void whenAreaSetThreePointsThenTriangleArea(){
        // создание объекта точек Point
        Point a = new Point(0,0);
        Point b = new Point(0,5);
        Point c = new Point(5,0);
        //Создание обьекта треугольника.
        Triangle triangle = new Triangle(a,b,c);
        //Вычисяем плщадь.
        double result = triangle.area(a,b,c);
        //Задаем ожидаемый результат
        double expected = 12.5;
        //Сравниваем результат с ожидаемым
        assertThat(result,closeTo(expected, 0.1));
    }

}

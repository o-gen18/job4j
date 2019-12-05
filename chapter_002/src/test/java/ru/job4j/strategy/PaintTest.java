package ru.job4j.strategy;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out; // получаем ссылку на стандартный вывод в консоль.
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // Создаём буфер для хранения вывода.
        System.setOut(new PrintStream(out)); //заменяем стандартный вывод на вывод в память для тестирования.
        new Paint().draw(new Square()); // выполняем действия пишущие в консоль.
        // проверяем результат вычисления..
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                            .append("-----\n\r")
                            .append("|     |\n\r")
                            .append("|     |\n\r")
                            .append("_____\n\r")
                            .append(System.lineSeparator())
                            .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }
    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                        .append("X\n\r")
                        .append("XX\n\r")
                        .append("XXX\n\r")
                        .append("XXXX\n\r")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
        System.setOut(stdout);
    }
}

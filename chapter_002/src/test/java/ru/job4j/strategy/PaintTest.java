package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    private final PrintStream stdout = System.out; //Поле содержит дефолтный вывод в консоль.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream(); //буфер для результата.

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
    // теперь вышестоящие методы можно вызывать в начале и в конце кода.
    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square()); // выполняем действия пишущие в консоль.
        // проверяем результат вычисления..
        assertThat(
                this.out.toString(),
                is(
                        new StringJoiner(
                                System.lineSeparator(), "",
                                System.lineSeparator())
                            .add("-----")
                            .add("|     |")
                            .add("|     |")
                            .add("_____")
                            .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
    }
    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                this.out.toString(),
                is(
                        new StringJoiner(
                                System.lineSeparator(), "",
                                System.lineSeparator())
                        .add("X")
                        .add("XX")
                        .add("XXX")
                        .add("XXXX")
                        .toString()
                )
        );
    }
}

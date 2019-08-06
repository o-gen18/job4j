package ru.job4.condition;

import org.junit.Test;
import ru.job4j.condition.DummyBot;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Oleg Generalov (oggen18@gmail.com)
 * @version 1.0
 * @since 6.8.19
 */
public class DummyBotTest {
    @Test
    public void whenGreetBot(){
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот."),is("Привет, умник."));
    }

    @Test
    public void whenByeBot(){
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."),is("До скорой встречи."));
    }
    @Test
    public void whenUnknownBot(){
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Сколько будет 2 + 2?"),is("Это ставит меня в тупик. Задайте другой вопрос."));

    }


}

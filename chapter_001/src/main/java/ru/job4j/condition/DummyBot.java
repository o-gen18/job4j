package ru.job4j.condition;

/**
 * @author Oleg Generelov(oggen18@gmail.com)
 * @version 1.0
 * @since 3.8.19
 */
public class DummyBot {
    /**
     * отвечает на вопросы.
     *
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {

        String request = answer("Пока.");
        System.out.println(request);
    }
}



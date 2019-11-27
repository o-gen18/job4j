package ru.job4j.tracker;
import ru.job4j.tracker.Item;
import java.util.Random;
import java.util.Objects;

/**
 * @version $Id$
 * @since 0.1
 */

public class Tracker {
    /*
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];
    /*
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /*
     * Метод, реализующий добавление заявки в хранилище.
     * @param item - новая заявка.
     *
     * Следующий метод генерирует уникальный ключ для заявки на основании времени и произвольного числа.
     * System.currentMillis() возвращает число, показвыающее сколько миллисекунд прошло с 1 января 1970 года.
     * Создаём объект класса Random. Его метод nextLong() вернёт произвольное число.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if ((this.items[i].getId()).equals(id)) {
                this.items[i] = item;
                item.setId(id);
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if ((this.items[i].getId()).equals(id)) {
                System.arraycopy(items, (i + 1), items, i, this.position);
                this.position--;
                result = true;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        Item[] itemscopy = new Item[this.position];
        for (int i = 0; i < this.position; i++) {
            itemscopy[i] = this.items[i];
        }
        return itemscopy;
    }

    public Item[] findByName(String key) {
        Item[] itemsnames = new Item[this.position];
        int k = 0;
        for (int i = 0; i < this.position; i++) {
            if ((this.items[i].getName()).equals(key)) {
                itemsnames[k] = this.items[i];
                k++;
            }
        }
        Item[] itemsnamesfinal = new Item[k];
        for (int i = 0; i < k; i++) {
            itemsnamesfinal[i] = itemsnames[i];
        }
        return itemsnamesfinal;
    }

    public Item findById(String id) {
        Item result = new Item();
        result = null;
        for (int i = 0; i < this.position; i++) {
            if ((this.items[i].getId()).equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }
}
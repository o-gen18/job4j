package ru.job4j.search;
import java.util.ArrayList;
import java.lang.String;
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержит key в любых полях.
     * @param key - ключ поиска.
     * @return список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
        for (int i = 0; i < persons.size(); i++) {
            String name = persons.get(i).getName();
            String surname = persons.get(i).getSurname();
            String phone = persons.get(i).getPhone();
            String address = persons.get(i).getAddress();
            if (name.contains(key) || surname.contains(key) || phone.contains(key) || address.contains(key)) {
                result.add(persons.get(i));
            }
        }
        return result;
    }
}

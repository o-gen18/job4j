package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class UserComparatorSortTest {
    @Test
    public void whenComparatorByNameUp() {
        Comparator<User> cmpNameUp = new UserDescByNameUp();
        int rsl = cmpNameUp.compare(
                new User("Petr", 33),
                new User("Oleg", 25)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenComparatorByNameDown() {
        Comparator<User> cmpNameDown = new UserDescByNameDown();
        int rsl = cmpNameDown.compare(
                new User("Petr", 33),
                new User("Oleg", 25)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByAgeUp() {
        Comparator<User> cmpAgeUp = new UserDescByAgeUp();
        int rsl = cmpAgeUp.compare(
                new User("Petr", 33),
                new User("Oleg", 25)
        );
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenComparatorByAgeDown() {
        Comparator<User> cmpAgeDown = new UserDescByAgeDown();
        int rsl = cmpAgeDown.compare(
                new User("Petr", 33),
                new User("Oleg", 25)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByNameAndAgeDown() {
        List<User> users = Arrays.asList(
                new User("Alex", 45),
                new User("Bob", 33),
                new User("Bob", 23),
                new User("Sam", 22),
                new User("Sam",21),
                new User("Tom", 20)
        );
        Collections.sort(users, new UserDescByNameDown().thenComparing(new UserDescByAgeDown()));
        System.out.println(users);
        List<User> expect = Arrays.asList(
                new User("Tom", 20),
                new User("Sam",22),
                new User("Sam", 21),
                new User("Bob", 33),
                new User("Bob", 23),
                new User("Alex", 45)
        );
        assertThat(users, is(expect));
    }
    @Test
    public void whenComparatorByAgeUpAndNameDown() {
        List<User> users = Arrays.asList(
                new User("Alex", 45),
                new User("Bob", 33),
                new User("Bob", 23),
                new User("Sam", 22),
                new User("Sam",21),
                new User("Tom", 20)
        );
        Collections.sort(users, new UserDescByAgeUp().thenComparing(new UserDescByNameDown()));
        System.out.println(users);
        List<User> expect = Arrays.asList(
                new User("Tom", 20),
                new User("Sam",21),
                new User("Sam", 22),
                new User("Bob", 23),
                new User("Bob", 33),
                new User("Alex", 45)
        );
        assertThat(users, is(expect));
    }
}

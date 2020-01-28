package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.array.CheckPrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when2() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when113() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(113);
        assertThat(rsl, is(true));
    }

    @Test
    public void when2268() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(2268);
        assertThat(rsl, is(false));
    }

    @Test
    public void when35() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(35);
        assertThat(rsl, is(false));
    }

    @Test
    public void when21() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(21);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(1);
        assertThat(rsl, is(false));
    }
}

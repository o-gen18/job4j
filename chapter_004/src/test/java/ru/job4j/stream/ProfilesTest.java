package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class ProfilesTest {
    @Test
    public void whenGetAdressList() {
        List<Profile> profiles= List.of(new Profile(new Address("Rostov", "Mechnikova", 73, 34)),
                new Profile(new Address("Moskow", "Lenina", 11, 32)),
                new Profile(new Address("London", "Park Road", 1, 21)));
        List<Address> addresses = new Profiles().collect(profiles);
        List<Address> expected = List.of(new Address("Rostov", "Mechnikova", 73, 34),
                new Address("Moskow", "Lenina", 11, 32),
                new Address("London", "Park Road", 1, 21));
        assertThat(addresses, is(expected));
    }
}

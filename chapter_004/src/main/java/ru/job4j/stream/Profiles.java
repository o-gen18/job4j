package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles){
        List<Address> addresses = profiles.stream().map(singleProfile -> singleProfile.getAddress()).collect(Collectors.toList());
        return addresses;
    }

    public List<Address> collectUnique(List<Profile> profiles) {
        List<Address> uniqueAddresses = profiles.stream().map(singleProfile -> singleProfile.getAddress()).sorted(new CityComparator()).distinct().collect(Collectors.toList());
        return uniqueAddresses;
    }

    public class CityComparator implements Comparator<Address> {
        @Override
        public int compare(Address first, Address second) {
            return first.getCity().compareTo(second.getCity());
        }
    }
}

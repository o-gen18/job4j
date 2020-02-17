package ru.job4j.collection;

import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

@Ignore
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expect = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};
        assertThat(result, is(expect));
    }

    @Test
    public void convertListOfArraysToSingleList() {
        List<int[]> list = List.of(
        new int[]{1, 2},
        new int[]{3, 4, 5, 6},
        new int[]{4, 5, 6, 7, 7, 2, 432});
        List<Integer> result = ConvertList2Array.convert(list);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 7, 2, 432);
        assertThat(result, is(expect));
    }
}

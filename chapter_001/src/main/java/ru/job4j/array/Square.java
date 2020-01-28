package ru.job4j.array;

import java.util.Arrays;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int k = 1;
        for (int i = 0; i != bound; i++) {
            rst[i] = k * k;
            k++;
        }
        return rst;
    }
}
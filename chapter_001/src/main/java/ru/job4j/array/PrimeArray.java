package ru.job4j.array;

import java.util.Arrays;

public class PrimeArray {
    private int x;

    public int[] howManyPrimesAreInGivenArray(int numb) {
        int k = 0;
        int[] prime;
        int[] prePrime = new int[numb / 2];
        CheckPrimeNumber method = new CheckPrimeNumber();
        for (int i = 0; i < numb; i++) {
            if (method.check(i)) {
                prePrime[k] = i;
                k++;
            }
        }
        prime = new int[k];
        for (int i = 0; i < k; i++) {
            prime[i] = prePrime[i];
        }
        this.x = k;
        System.out.println("Из " + numb + " первых натуральных чисел " + k + " являются простыми: " + Arrays.toString(prime));
        return prime;
    }

    public int[] giveMeFirstNPrimes(int n) {
        int i = 0;
        int k = 0;
        int[] prime;
        int[] prePrime = new int[n];
        CheckPrimeNumber method = new CheckPrimeNumber();
        while (prePrime[n - 1] == 0) {
            if (method.check(i)) {
                prePrime[k] = i;
                k++;
            }
            i++;
        }
        prime = new int[k];
        for (int l = 0; l < k; l++) {
            prime[l] = prePrime[l];
        }
        System.out.println("Ваш заказ на первые " + n + " простых чисел выполнен " + Arrays.toString(prime));
        return prime;
    }
}

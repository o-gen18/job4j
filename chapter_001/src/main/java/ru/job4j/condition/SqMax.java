package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int fourth) {
        int result = fourth;
        if (first > second) {
            if (first > third) {
                if (first > fourth) {
                    result = first;
                }
            }
        } else if (second > third) {
            if (second > fourth) {
                result = second;
            }
        } else if (third > fourth) {
            result = third;
        }
        return result;
    }
}

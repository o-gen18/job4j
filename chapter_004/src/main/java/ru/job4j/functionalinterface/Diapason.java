package ru.job4j.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Diapason {

    public static List<Double> diapason(int start, int end, Function<Double, Double> func){
        List<Double> list = new ArrayList<>();
        for (int index = start; index != end; index++) {
            list.add(func.apply((double) index));
        }
        return list;
    }
    public static List<Double> diapasonForLogFunc(int start, int end, int baseOfLog, BiFunction<Double, Double, Double> func){
        List<Double> list = new ArrayList<>();
        for (int index = start; index < end; index = index * baseOfLog) {
            list.add(func.apply((double) index, (double) baseOfLog));
        }
        return list;
    }
}

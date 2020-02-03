package ru.job4j.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Calculator {

    public interface Operation {
        double calc(int left, int right);
    }

//    public void multiply(int start, int finish, int value, Operation op) {
//        for (int index = start; index != finish; index++) {
//            System.out.println(op.calc(value, index));
//        }
//    }

//    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        calc.multiply(0, 10, 2, new Operation() {         в качестве аргумента передаётся анонимный класс, если нужно
//                    @Override                             изменить операцию - можно просто изменить этот анонимный класс
//                    public double calc(int left, int right) {        либо в этом месте вписать лямбда-выражение
//                        return left * right;
//                    }
//                }
//        );
//    }

//    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        calc.multiply(0, 10, 2, (value, index) -> (value * index)); (Здесь опускается параметр return его можно опустить,
//                если у нас один оператор, который сразу возвращает значение)
//    }

    //    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        calc.multiply(0, 10, 2, (value, index) -> {
//                    int result = value * index; (Здесь добавляется возможность выводить допольнительную информацию в консоль в лямбда выражении,
//                    System.out.printf("Multiply %s * %s = %s %n", value, index, result);//для этого используется расширенная форма записи (входящие параметры, через запятую без указания типа) ->  {операторы;return вычисленное значение;}
//                    return result;
//                }
//        );
//    }
    public void multiply(int start, int finish, int value,
                         BiFunction<Integer, Integer, Double> op,
                         Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiply(0, 10, 2,
                (value, index) -> {
                    double result = value * index;
                    System.out.printf("Multiply %s * %s = %s %n", value, index, result);
                    return result;
                },
                result -> System.out.println(result)
        );
    }
}
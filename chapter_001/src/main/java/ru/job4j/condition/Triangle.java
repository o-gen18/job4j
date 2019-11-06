package ru.job4j.condition;

public class Triangle {
    /**
     * Метод вычисления полупериметра по длинам сторон.
     * Формула
     * (a+b+c)/2
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полупериметр
     */
    public double period(double a, double b, double c){
        return (a+b+c)/2;
    }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон
     *
     * Сумма любыз двуз сторон должна быть больше третьей
     *
     * @param ab Длина от точки a до b.
     * @param ac Длина от точки a до c.
     * @param bc Длина от точки b до c.
     * @return true or false
     */
    private boolean exist(double ab, double ac, double bc){
        return ((ab+ac)>bc)&&((ab+bc)>ac)&&((bc+ac)>ab);
    }
    /**
     * Метод должен вычислять площадь треугольника
     * Формула
     * √p*(p-a)*(p-b)*(p-c)
     * Квадратный корень извлекать при помощь метода Math.sqrt().
     * @return вернуть площадь, если треугольник существует
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            //формула для рассчета площади треугольника
            rsl = Math.sqrt(p*(p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}

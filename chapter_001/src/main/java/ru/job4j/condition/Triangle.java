package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;   //Создаём 3 поля типа Point
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;   // Создаём конструктор с тремя переменными типа Point
        this.third = cp;
    }

        public double period(double ab, double bc, double ca) {
            return (ab + bc + ca) / 2;
        }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон
     *
     * Сумма любыз двуз сторон должна быть больше третьей
     *
     * @param ab Длина от точки a до b.
     * @param ca Длина от точки c до a.
     * @param bc Длина от точки b до c.
     * @return true or false
     */
    private boolean exist(double ab, double bc, double ca){
        return ((ab+bc)>ca)&&((ab+ca)>bc)&&((bc+ca)>ab);
    }
    /**
     * Метод должен вычислять площадь треугольника
     * Формула
     * √p*(p-a)*(p-b)*(p-c)
     * Квадратный корень извлекать при помощь метода Math.sqrt().
     * @return вернуть площадь, если треугольник существует
     */


    public double area(Point a, Point b, Point c) {
        double rsl = -1;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ca = third.distance(first);
        double p = period(ab,bc,ca);
        if (this.exist(ab, bc, ca)) {
            //формула для рассчета площади треугольника
            rsl = Math.sqrt(p*(p - ab) * (p - bc) * (p - ca));
        }
        return rsl;
    }
}

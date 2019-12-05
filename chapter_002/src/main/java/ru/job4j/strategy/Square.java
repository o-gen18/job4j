package ru.job4j.strategy;

/**
 * @author Oleg Generalov (oggen18@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----\n\r");
        sb.append("|     |\n\r");
        sb.append("|     |\n\r");
        sb.append("_____\n\r");
        return sb.toString();
    }
}
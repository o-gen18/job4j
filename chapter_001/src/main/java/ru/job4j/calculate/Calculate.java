package ru.job4j.calculate;

/**
 * Calculate.
 *
 * @author Oleg Generalov (oggen18@gmail.com)
 * @version 2.0
 * @since 11.7.19
 */

public class Calculate {
    /**
     * Main.
     *
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println("Hello, Job4j, this is my first program!");
    }

    /**
     * Method echo.
     *
     * @param name Your name.
     * @return Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
	 /*
	   Этот метод принимает параметр name и
	   возвращает строчку "Echo, echo, echo : "
	  */
    }
}
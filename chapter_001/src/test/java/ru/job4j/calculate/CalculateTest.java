package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Oleg Generalov (oggen18@gmail.com)
 * @version 1.0
 * @since 11.7.19
 */

public class CalculateTest {
	/**
	 * Test echo.
	 */
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String input = "Oleg Generalov";
		String expect = "Echo, echo, echo : Oleg Generalov";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}

}
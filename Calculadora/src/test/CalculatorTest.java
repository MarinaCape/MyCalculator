package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	//Class to test
	private Calculator calculator;
	
	/**
	 * Initialice requirements objets
	 * */
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		//arrange
		int firstNumber = 2;
		int secondNumber = 5;
		int expectedResult = 7;
		//act
		int realResult = calculator.add(firstNumber, secondNumber);
		//assert
		Assert.assertEquals(expectedResult, realResult);
	}
}

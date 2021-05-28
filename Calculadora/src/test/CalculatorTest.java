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
	
	@Test
	public void testSubstract() {
		//arrange
		int firstNumber = 3;
		int secondNumber = 1;
		int expectedResult = 2;
		//act
		int realResult = calculator.substract(firstNumber, secondNumber);
		//assert
		Assert.assertEquals(expectedResult, realResult);
	}
	
	@Test
	public void testMultiply() {
		//arrange
		int firstNumber = 3;
		int secondNumber = 6;
		int expectedResult = 18;
		//act
		int realResult = calculator.multiply(firstNumber, secondNumber);
		//assert
		Assert.assertEquals(expectedResult, realResult);
	}
}

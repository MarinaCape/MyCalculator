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
	
	@Test
	public void testDivide() {
		//arrange
		int firstNumber = 10;
		int secondNumber = 2;
		int expectedResult = 5;
		//act
		int realResult = calculator.divide(firstNumber, secondNumber);
		//assert
		Assert.assertEquals(expectedResult, realResult);
	}
	
	@Test
	public void testSqrt() {
		//arrange
		int number = 10;
		double expectedResult = 3.1622776601683793319988935444327;
		//act
		double realResult = calculator.sqrt(number);
		//assert
		Assert.assertTrue(expectedResult - realResult < 0.00001);
	}
}

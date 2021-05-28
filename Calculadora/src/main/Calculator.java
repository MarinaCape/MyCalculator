package main;

public class Calculator {
	
	public Calculator() {}
	
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public int substract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public int divide(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public double sqrt(int number) {
		//temporary variable  
		double temp;  
		double sqrtroot = number/2;  
		
		do {  
			temp = sqrtroot;  
			sqrtroot = (temp+(number/temp))/2; 
			
		} while((temp-sqrtroot)!= 0);  
		
		return sqrtroot;  
		 
	}
	
}

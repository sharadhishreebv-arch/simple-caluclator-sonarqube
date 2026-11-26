package com.calculator;

public class Calculator {
	public boolean isPositive(int number) {
	    if (number > 0) {
	        return true;
	    } else if (number < 0) {
	        return false;
	    } else if (number > 0) {
	        return true;
	    } else {
	        return false;
	    }
	}
	  // Addition method
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 20;
        int b = 10;
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);

        System.out.println("Addition: " + calculator.add(a, b));

        System.out.println("Subtraction: " + calculator.subtract(a, b));
        
    }
   
}

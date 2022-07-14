package day5;

import org.testng.Assert;

public class Overloading {

	public  void sum(int a, int b) { // Method with 2 parameter/arguments
		System.out.println("Addition of two int number is " + (a + b));
	}

	public  void sum(int a, int b, int c) {// Method with 3 parameter/arguments
		System.out.println("Addition of three int number is " + (a + b + c));
	}

	public  void sum(int a, double b) { // Method with 2 parameter/arguments but parameter type is different
		System.out.println("Addition of two mix number is " + (a + b));
	}

	public  void sum(double a, int b) {
		System.out.println("Addition of two mix number is " + (a + b));
	}

	public static void main(String[] args) {
		// ClassName is Assert & Static method Name is assertEquals
		Overloading ov=new Overloading();
		ov.sum(10, 20);
		ov.sum(9, 6, 8);
		ov.sum(8.8, 9);
	}
}

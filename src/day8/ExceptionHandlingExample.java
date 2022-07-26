package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 Values");

		int a = sc.nextInt();
		int b = sc.nextInt();

		
		try {
			System.out.println("Division is " + a / b);
		} catch (ArithmeticException A) {
			System.out.println(A.getMessage());
			// A.printStackTrace();
		} catch (Exception E) {
			System.out.println("Parent Exception");
			System.out.println(E.getMessage());
			E.printStackTrace();
		} finally {   // Optional... It will always execute whether exception occurring or not occurring
			System.out.println("I am from finally block. I will execute always");
			// Code like closing the connection with Database/File is written
		}

		System.out.println("Multiplication is " + a * b);
		System.out.println("Subtraction is " + (a - b));
		System.out.println("Addition  is " + (a + b));

	}
}

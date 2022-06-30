package day2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		/*
		 * Human prem=new Human(); prem.dance() Human Omkar=new Human();
		 */

		// Made object of Scanner for Taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("My age is " + age);
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter your Height");
		double ht = sc.nextDouble();
		System.out.println("My Name is " + name + " and Height is  " + ht);

		if (age > 60) { // This block will execute if conditio is true
			System.out.println("you are senior citizen");
		} else {
			System.out.println("you are still young");
		}

	}
}

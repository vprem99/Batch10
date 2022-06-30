package day2;

import java.util.Scanner;

public class Gradding {

	public static void main(String[] args) {
		/*
		 * Human prem=new Human(); prem.dance() Human Omkar=new Human();
		 */

		// Made object of Scanner for Taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int mk = sc.nextInt();
		
		if(mk>=0 && mk<=34)
			System.out.println("Fail");
		else if(mk>=35 && mk<=49)
			System.out.println("PAss");
		else if(mk>=50 && mk<=59)
			System.out.println("Second Class");
		else if(mk>=61 && mk<=74)
			System.out.println("First Class");
		else if(mk>=75 && mk<=100)
			System.out.println("Distinction");
		else
			System.out.println("Invalid Marks");

		
	}
}

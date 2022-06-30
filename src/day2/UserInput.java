package day2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int rem=num % 2 ;
		if (rem == 0) { // This block will execute if conditio is true
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}

	}
}

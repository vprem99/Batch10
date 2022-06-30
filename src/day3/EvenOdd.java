package day3;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int ch;
		// Made object of Scanner for Taking user input
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter your number");
			int num = sc.nextInt();

			if (num % 2 == 0) { // This block will execute if conditio is true
				System.out.println("Even");
			} else {
				System.out.println("ODD");
			}

			System.out.println("Do you have more number to check\n1.Yes\nAny number for No");
			ch = sc.nextInt();
		} while (ch == 1);
	}
}
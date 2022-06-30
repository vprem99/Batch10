package day2;

import java.util.Scanner;

public class SwitchExmple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your ticket Type\n1. AC\n2. I\n3. II");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Your ticket type is AC & Fare " + 2500);
			break;
		case 2:
			System.out.println("Your ticket type is First Class & Fare " + 1700);
			break;
		case 3:
			System.out.println("Your ticket type is Second Class & Fare " + 1200);
			break;
		default:
			System.out.println("Invalid option");

		}

	}
}
/*Select your browser 
1.Firefox
2.Chrome
3.Edge
4.IE*/
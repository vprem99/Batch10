package day2;

import java.util.Scanner;

public class ComparisonOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("A is Greater");
		} else if (b > a) {
			System.out.println("B is Greater");
		} else
			System.out.println("Both are same");

	}

}

package day2;

import java.util.Scanner;

public class DL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		System.out.println("Enter your Weight");
		double wt = sc.nextDouble();


		if (age >= 18 && age <= 60) {
			if (wt >= 100.0) {
				System.out.println("Allowed for DL");
			} else {
				System.out.println("Not allowed for DL since Weight not matching");
			}
		} else {
			System.out.println("Not allowed for DL since Age not matching");
		}

	}
}
/*0-34 Fail
35-49 Pass
50-59 Second Class
60-74 First Class
75- 100 Distiction */
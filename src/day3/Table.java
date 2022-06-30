package day3;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Printing table ");
		int m = sc.nextInt();

		for (int n = 1; n <= 10; n++) {
			System.out.println(m+"*"+n+"="+m*n);
			//System.out.println("m*n");
		}

	}

}
//2*1=2		2*2=4			2*3=6
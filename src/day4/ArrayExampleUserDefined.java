package day4;

import java.util.Scanner;

public class ArrayExampleUserDefined {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name[] = new String[4]; // A array of String type with size 4 is defined
		/*name[0] = "Aqm";
		name[1] = "PathGlow";
		name[2] = "Java";
		name[3] = "php";*/
		System.out.println("Enter 4 names");
		/*name[0] = sc.next();
		name[1] = sc.next();
		name[2] = sc.next();
		name[3]= sc.next();*/
		
		for(int i=0;i<name.length;i++)
		{
			name[i]=sc.next();
		}
		
		for (String x : name) { // For Each loop/ Advance For loop
			System.out.println(x);
		}
	}
}

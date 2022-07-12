package day5;

import java.util.Scanner;

public class Monitor {
	static String BName;
	String Color;
	int price;

	// Visibility-access-modifier returnType NameOfMethod()
	public void displaying() // Method Declartion Part
	{ // Methods Body | implementation part of Method
		// A method without body called as Abstract Method
		System.out.println("Displaying content");
	}

	public void getDetails() {
		System.out.println("Brand Name is " + BName);
		System.out.println("Color is " + Color);
		System.out.println("Price is " + price);
	}

	public int getPrice() {
		int gst = price * 18 / 100;
		return gst;
	}

	// abstract public void y();
}
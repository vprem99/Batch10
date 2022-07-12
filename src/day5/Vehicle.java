package day5;

public class Vehicle {

	String BName, color, type;
	int price;

	public void drive() {
		System.out.println("Drivinig Vehicle");
	}

	public void display() {
		System.out.println("Displaying Speed & Kilometer");
	}

	public void getDetails() {
		System.out.println("Brand : " + BName);
		System.out.println("Color : " + color);
		System.out.println("type : " + type);
		System.out.println("price : " + price);
	}
}

package day6;

public class Baby {
	Baby(int age) {
		System.out.println("You are in age  ConStructor");
		this.age = age;
	}

	Baby(String name, int age) {
		System.out.println("You are in  name & age  ConStructor");
		this.age = age;
		this.name = name;
	}

	Baby(String name, int age, boolean male) {
		System.out.println("You are in name, age & gender  ConStructor");
		this.age = age;
		this.name = name;
		this.male = male;
	}

	String name;
	int age;
	boolean male;

	public void getName() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Male Gender is " + male);
	}

}

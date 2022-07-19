package day7;

public class Emp {
	protected String name;
	private int basicSal = 20000;

	// New Salary is Set with help of Setter Method with some Checkpoint
	public void setSal(int newSal) {

		if (newSal > basicSal) {
			basicSal = newSal;
		}
	}

	public void getDetails() {
		System.out.println("Name is " + name);
		System.out.println("Salary is " + basicSal);
	}

}

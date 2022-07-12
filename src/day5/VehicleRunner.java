package day5;

class car extends Vehicle {
	
}

class Bike extends Vehicle {

	public void kickStart() {
		System.out.println("Kick Start of Bike");
	}
}

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.BName = "Maruti Suzuki";
		v.color = "Silver White";
		v.price = 600000;
		v.type = "CNG";
		v.display();
		v.drive();
		v.getDetails();
		
		Bike    b=new Bike();
		b.BName="Honda";
		b.color="Red";
		b.price=90000;
		b.type="Electric";
		b.display();
		b.drive();
		b.getDetails();
		b.kickStart();
	}

}

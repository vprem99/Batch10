package day7;

public class Encapsulation {

	public static void main(String[] args) {

		Emp e=new Emp();
		e.name="Omkar";
		
		e.getDetails();
		//e.basicSal=5000;
		e.setSal(55000);		
		e.getDetails();
	}
}
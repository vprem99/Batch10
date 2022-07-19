package day6;

import day7.Emp;

public class EnCapRunner {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.name="Omkar";
		
		e.getDetails();
		//e.basicSal=5000;
		e.setSal(55000);		
		e.getDetails();
	}

}

package day5;

public class CPU {

	public static void main(String[] args) {
		//int a;
		Monitor.BName="Samsung";     //ClassName.BrandName or ClassName.MethodName
		Monitor m1=new Monitor();   // m1 is Monitor Type
		//m1.BName="AOC";
		m1.price=4000;
		m1.Color="Black";
		m1.displaying();
		//m1.getDetails();
		
		
		Monitor m2=new Monitor();   // m2 is Monitor Type
		//m2.BName="Samsung";
		m2.price=7000;
		m2.Color="White";
		m2.displaying();
		m2.getDetails();
		m1.getDetails();
		int x=m2.getPrice();
		System.out.println("GST is "+x);
		//https://www.javatpoint.com/static-keyword-in-java
		System.out.println(m1);
		System.out.println(m2);
	}

}

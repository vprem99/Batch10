package day7;

import java.util.Scanner;


public class InterfaceRunner {

	public static void main(String[] args) {
		// Basic b = new Basic(); // You can not make object of Interface Since It has
		// only Method Declaration..no implementation
		
		Basic e=null;    // Parent p=new CHild
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Choice \n1.Eseries\n2.Jseries");
		int ch = sc.nextInt();

		if (ch == 1) {
			 e = new Eseries();
		} else if (ch == 2) {
			 e = new Jseries();
		} else
			System.out.println("Invalid Choice");

		e.in_call();
		e.in_sms();
		e.out_call();
		e.out_sms();
		
		
/*		
	WebDriver is interface  & ChromeDriver, FirefoxDriver, OperaDriver are classes which implements WebDriver		
	WebDriver driver=new ChromeDriver();	
	Here We have declared driver as Parent(WebDriver) Type since in run  time we don't know which browser will be 
	selected for running Script. If we declare driver as Parent(WebDriver) type then driver can hold object of any 
	child similar to above example.  */
		
	}
}

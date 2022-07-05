package day4;

public class PallindromNum {

	public static void main(String[] args) {

		int num = 121;
		int rem,rev=0, backup=num;
		while(num!=0) {
			rem=num%10;		//4			3			2
			num=num/10;     //123
			
			rev=rev*10+rem;   //4	43
		//	System.out.println(num   +" "+ rem);
		
		}
		System.out.println("reverse of the number "+rev);
		
		if(rev==backup)
			System.out.println("Pallindrome");
		else
			System.out.println("Not a Pallindrome");
	}

}

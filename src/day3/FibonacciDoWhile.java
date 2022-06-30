package day3;

public class FibonacciDoWhile {

	public static void main(String[] args) {
		// When While is Working as For Loop
		int a, b, c;
		a = 0;
		b = 1;
		int i = 1; // Counter Initialization
		do {
			System.out.print(a + ", ");
			c = a + b;
			a = b;
			b = c;
			i++;// Counter Increment
		} while (i <= 0); // COndition
	}
}

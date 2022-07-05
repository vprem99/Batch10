package day4;

public class ArrayExample {

	public static void main(String[] args) {

		// String name1="prem";
		// String name2="Ganesh";
		// String name3="Omkar";
		// Array is group/collection of similar kind of Data
		String []name = { "Prem", "AQM", "PathGlow", "Omkar", "Dipika" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
			//A variable similar to Array: name of Array
		for (String x : name) { // For Each loop/ Advance For loop
			System.out.println(x);
		}
	}

}

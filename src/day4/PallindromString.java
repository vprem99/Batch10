package day4;

public class PallindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "PREM CHAND SHARMA";
		// char nm[]=name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		String nm[] = name.split(" ");
		for (String x : nm) {
			System.out.println(x);
		}
		
		String newName=name.replaceAll(" ", "_");
		System.out.println(newName);
	}

}

package day4;

public class MaxNum {

	public static void main(String[] args) {
		int[] age = { 100, 30, 9, 90, 80 };

		int max = age[0]; // Assume

		for (int i = 0; i < age.length; i++) {
			if (max < age[i]) // 0 <10 | 10<30 | 30 < 9 | 30<90 | 90<80
				max = age[i];
		}

		System.out.println(max);

		int min = age[0]; // Assume
		for (int i = 0; i < age.length; i++) {
			if (min > age[i]) // 0 <10 | 10<30 | 30 < 9 | 30<90 | 90<80
				min = age[i];
		}
		System.out.println(min);

	}

}

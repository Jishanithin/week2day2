package week2day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		int i, j;

		String[] split = test.split(" ");
		System.out.println(Arrays.toString(split));
		for (i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				//System.out.println(split[i]);
				int length = split[i].length();
				for (j = length - 1; j >= 0; j--) {

					System.out.println(split[i].charAt(j));

				}
				System.out.println(" ");

			} else {
				System.out.println(split[i] + " ");
			}
		}
	}

}

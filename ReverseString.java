package week2day2;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";

		char[] ch = test.toCharArray();
		String rev = "";

		for (int i = test.length() - 1; i >=0; i--) {
			rev = rev + ch[i];
			}
		
		System.out.print(rev);
	}

}

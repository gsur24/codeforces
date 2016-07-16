import java.util.*;
public class 71A {

	public static String tooLong(String s) {
		if (s.length() > 10) {
			StringBuffer newString = new StringBuffer();
			newString.append(s.charAt(0));
			newString.append(s.length() - 2);
			newString.append(s.charAt(s.length() - 1));
			return newString.toString();
		}

		else {
			return s;
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		int n = Integer.parseInt(number);
		for (int i = 0; i < n; i++) {
			String s = scan.nextLine();
			System.out.println(tooLong(s));
		}
	}
}

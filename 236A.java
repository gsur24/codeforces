import java.util.*;
public class 236A {

	public static boolean chat(String s) {

		boolean[] letters = new boolean[26];

		for (int j = 0; j < s.length(); j++) {

			char c = s.charAt(j);

			if (letters[((int)(c - 'a'))]) {
				// do nothing
			}

			else {
				letters[((int)(c - 'a'))] = true;
			}
		}

		int count = 0;

		for (int i = 0; i < letters.length; i++) {
			if (letters[i])
				count++;
		}

		if (count % 2 == 0) {
			return true;
		}

		else {
			return false;
		}

	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		if (chat(s)) {
			System.out.println("CHAT WITH HER!");
		}

		else {
			System.out.println("IGNORE HIM!");
		}
	}
}

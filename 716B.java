import java.util.*;
import java.io.*;

public class practice {

	public static String fill (String s, int start, int end) {
		char[] str = s.toCharArray();
		boolean[] chars = new boolean[26];

		for (int i = start; i <= end; i++) {
			if (s.charAt(i) != '?')
				chars[s.charAt(i) - 'A'] = true;
		}

		int index = start;

		for (int j = start; j <= end; j++) {
			if (s.charAt(j) == '?') {
				while (index <= end && chars[index - start])
					index++;
				str[j] = (char)('A' + (index++ - start));	
			}
		}

		for (int counter = 0; counter < str.length; counter++) {
			if (str[counter] == '?')
				str[counter] = 'A';
		}

		return new String(str);
	}

	public static String complete(String s) {
		if (s.length() < 26) {
			return "-1";
		}

		int start = 0;
		int end = 0;
		int blank = 0;
		HashSet<Character> chars = new HashSet<Character>();

		while (start < s.length() && end < s.length()) {

			if (s.charAt(end) == '?') 
				blank++;

			else if (chars.contains(s.charAt(end))) {
				while (s.charAt(start) != s.charAt(end)) {
					if (s.charAt(start) == '?') blank--;
					else {chars.remove(s.charAt(start));}
					start++;
				}
				start++;	
			}

			else {
				chars.add(s.charAt(end));
			}

			if (chars.size() + blank == 26) {
				return fill(s, start, end);
			}

			end++;
		}

		return "-1";
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(complete(str));
	}
}


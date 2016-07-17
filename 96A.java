import java.util.*;

public class 96A {
	
	public static boolean dangerous(int[] players) {
		if (players.length < 8) {
			return false;
		}

		int current = players[0];
		int current_count = 0;

		for (int i = 0; i < players.length; i++) {
			if (current != players[i]) {
				current = players[i];
				current_count = 1;
			}

			else {
				current_count++;
			}

			if (current_count == 7) {
				return true;
			}
		}

		return false;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String team = s.nextLine();
		int[] players = new int[team.length()];

		for (int i = 0; i < team.length(); i++) {
			players[i] = Character.getNumericValue(team.charAt(i));
		}

		if (dangerous(players)) {
			System.out.println("YES");
		}

		else {
			System.out.println("NO");
		}
	}
}

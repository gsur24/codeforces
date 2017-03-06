import java.util.*;
import java.io.*;
public class practice {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int limit = s.nextInt();

		int onScreen = 0;
		int previous = -1;

		for (int i = 0; i < n; i++) {

			int current = s.nextInt();

			if (previous == -1) {
				previous = current;
				onScreen++;
			}

			else {
				if (current - previous > limit) {
					onScreen = 1;
					previous = current;
				}

				else {
					previous = current;
					onScreen++;
				}
			}
		}

		System.out.println(onScreen);
	}

}

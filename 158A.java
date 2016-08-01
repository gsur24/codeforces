import java.util.*;
public class 158A {

	public static int progress (int[] integerArray, int boundary) {

		int number = 0;

		for (int counter = 0; counter < integerArray.length; counter++) {
			if ((integerArray[counter] >= boundary) && integerArray[counter] > 0)
				number++;
		}

		return number;
	}

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();

		int[] integerArray = new int[n];

		for (int i = 0; i < n; i++) {
			integerArray[i] = s.nextInt();
		}

		System.out.println(progress(integerArray, integerArray[k - 1]));
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class IntArrayInOneLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Read an array of int from the console in a single line, using the
		// Stream API
		int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(a -> Integer.parseInt(a)).toArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}

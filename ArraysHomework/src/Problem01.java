import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = Integer.MAX_VALUE;

		System.out.println("Enter the array elements");
		// Array solution
		String[] line = sc.nextLine().split("[^0-9-]+");
		int[] array = new int[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
			if (array[i] % 3 == 0 && array[i] < result) {
				result = array[i];
			}
		}

		System.out.println(result);
		sc.close();
	}
}

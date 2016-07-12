import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		String[] line = sc.nextLine().split("[^0-9-]+");
		int[] array = new int[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}

		int[] result = new int[array.length];
		result[0] = array[0];
		result[result.length - 1] = array[array.length - 1];

		for (int i = 1; i < result.length - 1; i++) {
			result[i] = array[i - 1] + array[i + 1];
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		sc.close();
	}
}

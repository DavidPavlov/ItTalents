import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		String[] line = sc.nextLine().split("[^0-9-]+");
		int[] array = new int[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}

		int[] result = new int[array.length * 2];

		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}
		int count = array.length - 1;
		for (int i = array.length; i < result.length; i++) {
			result[i] = array[count];
			count--;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		sc.close();
	}
}

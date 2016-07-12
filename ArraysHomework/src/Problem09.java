import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		String[] line = sc.nextLine().split("[^0-9-]+");
		int[] array = new int[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}

		int index = array.length - 1;
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			index--;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		sc.close();
	}
}

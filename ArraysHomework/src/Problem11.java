import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		int[] array = new int[7];
		String[] line = sc.nextLine().split("[^0-9-]+");

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0 && array[i] > 5) {

				System.out.print(array[i] + ",");
				count++;
			}
		}
		System.out.print("- " + count + " numbers");
		sc.close();
	}
}

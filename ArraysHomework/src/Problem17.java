import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		String[] line = sc.nextLine().split("[^0-9-]+");
		int[] array = new int[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}

		boolean isZigZag = true;

		for (int i = 1; i < array.length; i++) {
			if (i % 2 == 1) {
				if (array[i] < array[i - 1]) {
					isZigZag = false;
					break;
				}
			} else {
				if (array[i] > array[i - 1]) {
					isZigZag = false;
					break;
				}
			}
		}

		System.out.println(isZigZag ? "The sequence is ZigZag" : "Not ZigZag");
		sc.close();
	}
}

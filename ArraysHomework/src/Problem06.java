import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first array elements:");
		String[] line = sc.nextLine().split("[^0-9-]+");
		int[] array = new int[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}

		System.out.println("Enter the second array elements:");
		line = sc.nextLine().split("[^0-9-]+");
		int[] secondArray = new int[line.length];

		for (int i = 0; i < line.length; i++) {
			secondArray[i] = Integer.parseInt(line[i]);
		}

		boolean areEqual = true;
		if (array.length != secondArray.length) {
			areEqual = false;
			System.out.print("Not the same size; ");
		} else {
			for (int i = 0; i < secondArray.length; i++) {
				if (array[i] != secondArray[i]) {
					areEqual = false;
					break;
				}
			}
		}

		System.out.println(areEqual ? "Same size; Equal" : "Not Equal");
		sc.close();
	}
}

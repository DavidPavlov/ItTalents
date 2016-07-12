import java.util.Scanner;

public class Problem18 {

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
		int max = array.length >= secondArray.length ? secondArray.length : array.length;

		int[] result = new int[max];

		for (int i = 0; i < result.length; i++) {
			result[i] = array[i] > secondArray[i] ? array[i] : secondArray[i];
		}

		System.out.print("First array: ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ", ");
		}

		System.out.println();
		System.out.print("Second array: ");
		for (int i = 0; i < secondArray.length; i++) {
			if (i == secondArray.length - 1) {
				System.out.print(secondArray[i]);
				break;
			}
			System.out.print(secondArray[i] + ", ");
		}

		System.out.println();
		System.out.print("Result: ");
		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {
				System.out.print(result[i]);
				break;
			}
			System.out.print(result[i] + ", ");
		}

		sc.close();
	}
}

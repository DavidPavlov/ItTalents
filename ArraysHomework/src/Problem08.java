import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		String[] line = sc.nextLine().split("[^0-9-]+");
		int[] array = new int[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}

		int element = array[0];
		int count = 1;
		int tempCount = 1;
		int index = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] != element) {
				element = array[i];
				tempCount = 1;
			} else {
				tempCount++;
				if (tempCount > count) {
					count = tempCount;
					index = i;
				}
			}
		}

		System.out.println("The longest subsequence of equal elements is with length: " + count);
		for (int i = index; i > index - count; i--) {
			System.out.print(array[i] + " ");
		}

		sc.close();
	}
}

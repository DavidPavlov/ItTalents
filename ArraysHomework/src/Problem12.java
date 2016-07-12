import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		int[] array = new int[7];
		String[] line = sc.nextLine().split("[^0-9-]+");

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}

		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;

		array[2] += array[3];
		array[3] = array[2] - array[3];
		array[2] -= array[3];

		array[4] *= array[5];
		array[5] = array[4] / array[5];
		array[4] /= array[5];

		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i] + ",");
		}
		sc.close();
	}
}

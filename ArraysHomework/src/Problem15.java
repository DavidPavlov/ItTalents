import java.util.Scanner;

public class Problem15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		String[] line = sc.nextLine().split("[^0-9-.]+");
		double[] array = new double[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Double.parseDouble(line[i]);
		}

		double max = array[0];
		double[] result = new double[3];
		for (int i = 2; i >= 0; i--) {
			// find the current max number
			for (int j = 1; j < array.length; j++) {
				if (Math.abs(array[j]) > Math.abs(max)) {
					max = array[j];
				}
			}
			// remove the current max number
			for (int j = 0; j < array.length; j++) {
				if (array[j] == max) {
					array[j] = 0;
					break;
				}
			}

			result[i] = max;
			max = 0;
		}

		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {
				System.out.print(result[i]);
				break;
			}
			System.out.print(result[i] + "; ");
		}

		sc.close();
	}
}

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		String[] line = sc.nextLine().split("[^0-9-.]+");
		double[] array = new double[line.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Double.parseDouble(line[i]);
		}

		double[] result = new double[array.length];
		for (int i = 0; i < result.length; i++) {
			if (array[i] < -0.231) {
				result[i] = (i + 1) * (i + 1) + 41.25;
			} else {
				result[i] = array[i] * (i + 1);
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(String.format("%.2f", array[i]));
				break;
			}
			System.out.print(String.format("%.2f, ", array[i]));
		}

		System.out.println();
		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {
				System.out.print(String.format("%.2f", result[i]));
				break;
			}
			System.out.print(String.format("%.2f, ", result[i]));
		}

		sc.close();
	}
}

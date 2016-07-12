import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		int[] array = new int[7];
		String[] line = sc.nextLine().split("[^0-9-]+");

		int avg = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(line[i]);
			avg += array[i];
		}
		avg /= 7;
		int closest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (Math.abs(avg - closest) > Math.abs(avg - array[i])) {
				closest = array[i];
			}
		}

		System.out.println("Array average: " + avg + " Closest: " + closest);
		sc.close();
	}
}

import java.util.Scanner;

public class Problem15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int sum = 0;
		int iterator = 1;

		// Calculate the sum from 1 to number
		if (num >= 1) {
			// If the number is positive
			do {
				sum += iterator;
				iterator++;
			} while (iterator <= num);
		} else {
			// If the number is 0 or negative
			do {
				sum += iterator;
				iterator--;
			} while (iterator >= num);
		}

		System.out.println(sum);
		sc.close();
	}
}

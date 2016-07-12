import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int sum = sc.nextInt();

		while (sum < 2 || sum > 27) {
			System.out.println("Enter the number:");
			sum = sc.nextInt();
		}

		for (int i = 100; i < 1000; i++) {
			int firstDigit = i / 100;
			int secondDigit = (i % 100) / 10;
			int thirdDigit = i % 10;

			if (firstDigit + secondDigit + thirdDigit == sum) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}

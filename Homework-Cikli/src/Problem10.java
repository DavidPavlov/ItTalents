import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		boolean isPrime = false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("The number is NOT prime");
		} else {
			System.out.println("The number is prime");
		}
		sc.close();
	}
}

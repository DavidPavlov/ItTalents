import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int sum = 0;
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
		} else {
			// if the number is negative
			for (int i = 1; i >= num; i--) {
				sum += i;
			}
		}
		System.out.println("The result is: " + sum);
		sc.close();
	}
}

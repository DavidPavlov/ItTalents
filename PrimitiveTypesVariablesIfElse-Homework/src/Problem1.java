import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		double a = sc.nextDouble();

		System.out.println("Please enter B:");
		double b = sc.nextDouble();

		System.out.println("Please enter C:");
		double c = sc.nextDouble();

		if ((c < b && c > a) || (c > b && c < a)) {
			System.out.println(String.format("Number " + c + " is between " + a + " and " + b));
		} else {
			System.out.println(String.format("Number " + c + " is not between " + a + " and " + b));
		}

	}
}
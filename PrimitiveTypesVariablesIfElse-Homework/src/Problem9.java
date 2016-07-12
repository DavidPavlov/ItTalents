import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers with 2 digits each");
		System.out.println("First number: ");

		int a = sc.nextInt();

		System.out.println("Second Number");
		int b = sc.nextInt();

		int product = a * b;
		if (product % 2 == 0) {
			System.out.println(String.format("%d, %d, even", product, product % 10));
		} else {
			System.out.println(String.format("%d, %d, odd", product, product % 10));
		}
	}
}

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		int a = sc.nextInt();

		System.out.println("Please enter B:");
		int b = sc.nextInt();

		System.out.println("Please enter C:");
		int c = sc.nextInt();

		if (a > b) {
			if (b > c) {
				System.out.println(String.format("%d %d %d", a, b, c));
			} else if (a > c) {
				System.out.println(String.format("%d %d %d", a, c, b));
			} else {
				System.out.println(String.format("%d %d %d", c, a, b));
			}
		} else {
			if (a > c) {
				System.out.println(String.format("%d %d %d", b, a, c));
			} else if (b > c) {
				System.out.println(String.format("%d %d %d", b, c, a));
			} else {
				System.out.println(String.format("%d %d %d", c, b, a));
			}
		}

	}
}

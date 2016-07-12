import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		int a = sc.nextInt();

		System.out.println("Please enter B:");
		int b = sc.nextInt();

		System.out.println("Please enter C:");
		int c = sc.nextInt();

		System.out.println(String.format("The old values are: %d %d %d", a, b, c));

		int temp = c;
		c = a;
		a = b;
		b = temp;

		System.out.println(String.format("The NEW values are: %d %d %d", a, b, c));
	}
}

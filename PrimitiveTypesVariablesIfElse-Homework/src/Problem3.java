import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		int a = sc.nextInt();

		System.out.println("Please enter B:");
		int b = sc.nextInt();

		int temp = a;
		a = b;
		b = temp;

		System.out.println(String.format("The new value of A is: %d", a));
		System.out.println(String.format("The new value of B is: %d", b));
	}
}

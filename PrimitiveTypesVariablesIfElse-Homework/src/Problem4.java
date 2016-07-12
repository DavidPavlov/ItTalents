import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		int a = sc.nextInt();

		System.out.println("Please enter B:");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(b + " " + a);
		} else if (b > a) {
			System.out.println(a + " " + b);
		} else {
			System.out.println("The numbers are equal !");
		}
	}
}

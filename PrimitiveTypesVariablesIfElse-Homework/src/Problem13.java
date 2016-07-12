import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Temperature");
		int temp = sc.nextInt();

		if (temp < -20) {
			System.out.println("Ice cold");
		} else if (temp < 0 && temp >= -20) {
			System.out.println("Cold");
		} else if (temp < 15 && temp >= 0) {
			System.out.println("A bit cold");
		} else if (temp <= 25 && temp >= 15) {
			System.out.println("Warm");
		} else {
			System.out.println("Hot!");
		}
	}
}

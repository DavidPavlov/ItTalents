import java.util.Scanner;

public class Problem15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Hour");

		int hour = sc.nextInt();
		if (hour > 24 || hour < 0) {
			System.out.println("Invalid Hour !!!");
			return;
		}

		if (hour >= 4 && hour < 9) {
			System.out.println("Good Morning");
		} else if (hour >= 9 && hour < 18) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
	}
}

import java.util.Scanner;

public class Problem16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a 3 digit number");
		int num = sc.nextInt();
		int first = num / 100;
		int second = (num / 10) % 10;
		int third = num % 10;

		if (first == second && second == third) {
			System.out.println("The digits are equal");
		} else if (first > second && second > third) {
			System.out.println("The digits are in decreasing order");
		} else if (third > second && second > first) {
			System.out.println("The digits are in increasing order");
		} else {
			System.out.println("The digits are not ordered");
		}

	}
}

import java.util.Scanner;

public class Problem24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int copy = num;

		while (num < 10 || num > 30000) {
			System.out.println("Invalid number. Enter again:");
			num = sc.nextInt();
		}

		int reversed = 0;
		int revMod = 0;
		do {
			revMod = num % 10;
			reversed = reversed * 10 + revMod;
			num /= 10;
		} while (num > 0);
		if (copy == reversed) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not a palindrome");
		}

		sc.close();
	}
}

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a 3 digit number, which not contain 0");
		int num = sc.nextInt();
		if (num % (num / 100) == 0 && num % ((num / 10) % 10) == 0 && num % (num % 10) == 0) {
			System.out.println("The number can be divided by all of it's digits");
		} else {
			System.out.println("The number cannot be divided by all of it's digits");
		}
	}
}

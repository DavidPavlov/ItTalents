import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a 4 digit number");
		int num = sc.nextInt();

		int first = (num / 1000) * 10 + num % 10;
		int second = ((num / 100) % 10) * 10 + ((num / 10) % 10);

		if (first > second) {
			System.out.println(String.format("%d > %d", first, second));
		} else if (first < second) {
			System.out.println(String.format("%d < %d", first, second));
		} else {
			System.out.println(String.format("%d = %d", first, second));
		}

	}
}

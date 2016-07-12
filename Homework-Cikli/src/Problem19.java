import java.util.Scanner;

public class Problem19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();

		while (num < 10 || num > 99) {
			System.out.println("Enter the number:");
			num = sc.nextInt();
		}
		do {
			System.out.print(num + " ");
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = 3 * num + 1;
			}
		} while (num != 1);

		System.out.print("1");
		sc.close();
	}
}

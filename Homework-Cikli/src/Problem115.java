import java.util.Scanner;

public class Problem115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();
		int chars = 1;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("*");
			} else if (i == num) {

				for (int j = 0; j < chars; j++) {
					System.out.print("*");
				}

			} else {
				System.out.print("*");

				for (int j = 0; j < chars - 2; j++) {
					System.out.print(" ");
				}

				System.out.print("*");

			}
			chars += 2;
			System.out.println();

		}
		sc.close();
	}
}
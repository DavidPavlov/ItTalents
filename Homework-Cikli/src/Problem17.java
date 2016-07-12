import java.util.Scanner;

public class Problem17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a side and a character ");
		int side = sc.nextInt();
		char c = sc.next().charAt(0);

		for (int i = 0; i < side; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int i = 1; i < side - 1; i++) {
			System.out.print("*");

			for (int j = 1; j < side - 1; j++) {
				System.out.print(c);
			}

			System.out.print("*");
			System.out.println();
		}

		for (int i = 0; i < side; i++) {
			System.out.print("*");
		}

		sc.close();
	}
}

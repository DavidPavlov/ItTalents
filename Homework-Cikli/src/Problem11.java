import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();
		int chars = 1;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < chars; j++) {
				System.out.print("*");
			}
			System.out.println();
			chars += 2;
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first num");
		int a = sc.nextInt();
		System.out.println("Enter the second num");
		int b = sc.nextInt();

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		for (int i = a; i <= b; i++) {
			System.out.print(i);
			if (i != b) {
				System.out.print(" ");
			}
		}
		sc.close();
	}
}
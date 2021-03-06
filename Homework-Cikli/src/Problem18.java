import java.util.Scanner;

public class Problem18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers:");
		int n = sc.nextInt();
		int m = sc.nextInt();

		while (n < 1 || n > 9 || m < 1 || m > 9) {
			System.out.println("Invalid numbers. Enter again:");
			n = sc.nextInt();
			m = sc.nextInt();
		}

		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(String.format("%d*%d=%d", i, j, i * j));
			}
		}

		sc.close();
	}
}

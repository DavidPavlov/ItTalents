import java.util.Scanner;

public class Problem16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers:");
		int n = sc.nextInt();
		int m = sc.nextInt();

		while (n < 10 || n > 5555 || m < 10 || m > 5555) {
			System.out.println("Invalid number. Enter again:");
			n = sc.nextInt();
			m = sc.nextInt();
		}

		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}

		for (int i = m; i > n; i--) {
			if (i % 50 == 0) {
				System.out.println(i);
				for (int j = i - 50; j > n; j -= 50) {
					System.out.println(j);
				}
				break;
			}
		}
		sc.close();
	}
}

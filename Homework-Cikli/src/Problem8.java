import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n");
		int n = sc.nextInt();
		int num = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(num);
			}
			System.out.println();
			num += 2;
		}
		sc.close();
	}
}

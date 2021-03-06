import java.util.Scanner;

public class Problem22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int i = 1;

		while (i <= 10) {
			while (!(num % 2 == 0 || num % 3 == 0 || num % 5 == 0)) {
				num++;
			}
			if (i != 10) {
				System.out.print(String.format("%d:%d, ", i, num));
			} else {
				System.out.print(String.format("%d:%d", i, num));
			}

			i++;
			num++;
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Problem14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();

		while (num < 10 || num > 200) {
			System.out.println("Invalid number. Enter again:");
			num = sc.nextInt();
		}

		for (int i = num; i >= 7; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Problem9 {
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

		int sum = 0;

		for (int i = a; i <= b; i++) {
			if ((i * i) % 3 == 0) {
				System.out.print("skip 3 ");
			} else {
				System.out.print(i * i + " ");
				sum += i * i;
			}
			if (sum > 200) {
				break;
			}

		}
		sc.close();
	}
}

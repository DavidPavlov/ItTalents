import java.util.Scanner;

public class Problem14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the coordinates");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		if (x1 % 2 == y1 % 2) {
			if (x2 % 2 == y2 % 2) {
				System.out.println("The fields are with same color");
			} else {
				System.out.println("The fields are not with the same color");
			}
		} else {
			if (x2 % 2 != y2 % 2) {
				System.out.println("The fields are with same color");
			} else {
				System.out.println("The fields are not with the same color");
			}
		}
	}
}

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = null;
		do {
			System.out.println("Enter two strings on a single line");
			input = sc.nextLine().split(", ");
		} while (input.length != 2);

		String first = input[0];
		String second = input[1];

		int firstSum = 0;
		int secondSum = 0;
		int i = 0;
		while (true) {
			if (i < first.length()) {
				firstSum += first.charAt(i);
			}
			if (i < second.length()) {
				secondSum += second.charAt(i);
			}
			if (i >= first.length() && i >= second.length()) {
				break;
			}
			i++;
		}

		System.out.println(firstSum > secondSum ? first.toString() : second.toString());
		sc.close();
	}
}

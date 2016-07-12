import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = null;
		do {
			System.out.println("Enter two strings on a single line");
			input = sc.nextLine().split("[,. -_]+");
		} while (input.length != 2);

		String first = input[0];
		String second = input[1];

		int length = first.length() > second.length() ? first.length() : second.length();
		String output = first.length() > second.length() ? "First is longer than second"
				: first.length() == second.length() ? "The two strings are with equal length"
						: "Second is longer than first";
		System.out.println(output);

		System.out.println("Difference by positions: ");
		boolean areEqual = true;
		for (int i = 0; i < length; i++) {
			if (i < first.length() && i < second.length()) {
				if (first.charAt(i) != second.charAt(i)) {
					areEqual = false;
					System.out.printf("%d %s-%s%n", i + 1, first.charAt(i), second.charAt(i));
				}
			} else {
				if (first.length() > second.length()) {
					System.out.printf("%d %s-%s%n", i + 1, first.charAt(i), " ");
				} else {
					System.out.printf("%d %s-%s%n", i + 1, " ", second.charAt(i));
				}
			}
		}
		if (areEqual) {
			System.out.println("There are no diferences !");
		}
		sc.close();
	}
}

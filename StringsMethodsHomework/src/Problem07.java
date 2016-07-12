import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String[] input = sc.nextLine().split(" ");
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > max) {
				max = input[i].length();
			}
		}
		System.out.printf("%d words, the longest is with %d symbols", input.length, max);
		sc.close();
	}
}

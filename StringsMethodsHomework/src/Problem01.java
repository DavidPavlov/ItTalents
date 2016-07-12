import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String first = null;
		String second = null;
		do {
			System.out.println("Enter two strings with 40 characters or less");
			first = sc.next();
			second = sc.next();
		} while (first.length() > 40 || second.length() > 40);

		System.out.printf("%s %s %s %s", first.toUpperCase(), first.toLowerCase(), second.toUpperCase(),
				second.toLowerCase());

		sc.close();
	}
}

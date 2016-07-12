import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String first = null;
		String second = null;
		do {
			System.out.println("Enter two strings with 20 characters or less");
			first = sc.next();
			second = sc.next();
		} while (first.length() > 20 || second.length() > 20);

		int longer = first.length() > second.length() ? first.length() : second.length();

		first = second.substring(0, 5) + first.substring(5);
		second = first.substring(0, 5) + second.substring(5);

		System.out.printf("%d %s", longer, first.length() > second.length() ? first : second);
		sc.close();
	}
}

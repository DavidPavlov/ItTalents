import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String full = sc.nextLine();
		System.out.println("Enter a prefix to check");
		String prefix = sc.nextLine();
		if (full.startsWith(prefix)) {
			System.out.println("The string starts with " + prefix);
		} else {
			System.out.println("The string does not start with " + prefix);
		}
		sc.close();
	}
}

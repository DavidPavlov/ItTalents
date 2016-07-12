import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");

		String line = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < line.length(); i++) {
			sb.append((char) (line.charAt(i) + 5));
		}
		System.out.println(sb.toString());
		sc.close();
	}
}

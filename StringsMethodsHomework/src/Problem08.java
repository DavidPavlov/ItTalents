import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String line = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = line.length() - 1; i >= 0; i--) {
			sb.append(line.charAt(i));
		}
		System.out.println(line.equals(sb.toString()) ? "Yes" : "No");
		sc.close();
	}
}

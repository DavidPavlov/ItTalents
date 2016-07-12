import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String[] input = sc.nextLine().split(" ");
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String token = input[i];
			String modified = token.substring(0, 1).toUpperCase() + token.substring(1, token.length());
			output[i] = modified;
		}
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		sc.close();
	}
}

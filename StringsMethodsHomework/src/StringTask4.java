import java.util.Scanner;

public class StringTask4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String full = sc.nextLine();
		String lower = full.toLowerCase().replaceAll(" +", "");
		int[] arr = new int[26];
		for (int i = 0; i < lower.length(); i++) {
			arr[lower.charAt(i) - 97] += 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(((char) (i + 97)) + ": " + arr[i] + " times");
		}
		sc.close();
	}
}

import java.util.Scanner;

public class StringTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first and last name, separated by space");
		String[] names = sc.nextLine().split(" +");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i].charAt(0) + ". ");
		}
		sc.close();
	}
}
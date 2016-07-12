import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");

		String[] line = sc.nextLine().split("-");
		for (int i = 0; i < line.length; i++) {
			line[i] = "-" + line[i];
		}

		int sum = 0;
		for (int i = 0; i < line.length; i++) {
			String[] tokens = line[i].split("[^0-9-]+|-*[^0-9-]+");
			for (int j = 0; j < tokens.length; j++) {
				if (tokens[j].equals("-")) {
					continue;
				}
				sum += (Integer.parseInt(tokens[j]));
				System.out.println(tokens[j]);
			}
		}
		System.out.println("Sum = " + sum);
		sc.close();

	}
}

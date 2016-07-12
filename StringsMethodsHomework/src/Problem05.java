import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String first = sc.nextLine();
		System.out.println("Enter the second string");
		String second = sc.nextLine();
		char ch = '|';
		for (int i = 0; i < first.length(); i++) {
			int x = i;
			if (second.chars().anyMatch(c -> c == first.charAt(x))) {
				ch = first.charAt(i);
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		int index = first.indexOf(ch);
		int secIndex = second.indexOf(ch);
		if (index == -1) {
			System.out.println("There is no same character in the words");
		} else {
			for (int i = 0; i < second.length(); i++) {
				if (i == secIndex) {
					sb.append(first + "\n");
				} else {
					for (int j = 0; j < index; j++) {
						sb.append(" ");
					}
					sb.append(second.charAt(i));
					sb.append("\n");
				}

			}
			System.out.println(sb.toString());
		}
		sc.close();
	}
}


public class Problem20 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			for (int j = i; j <= 9; j++) {
				System.out.print(j + " ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

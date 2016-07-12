
public class Problem12 {
	public static void main(String[] args) {

		for (int i = 100; i < 1000; i++) {
			int firstDigit = i / 100;
			int secondDigit = (i % 100) / 10;
			int thirdDigit = i % 10;

			if (firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit) {
				System.out.println(i);
			}
		}
	}
}

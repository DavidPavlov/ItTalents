
public class Problem23 {
	public static void main(String[] args) {

		int currentNum = 1;
		int i = 1;
		while (currentNum <= 9) {
			while (i <= 9) {
				if (i >= currentNum) {
					System.out.print(String.format("%d*%d; ", currentNum, i));
				}
				i++;
			}
			i = 1;
			currentNum++;
			System.out.println();
		}

	}
}

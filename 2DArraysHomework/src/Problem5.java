
public class Problem5 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int largestRowSum = Integer.MIN_VALUE;
		int largestColSum = Integer.MIN_VALUE;
		int currentRowSum = 0;
		int currentColSum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				currentRowSum += arr[i][j];
				currentColSum += arr[j][i];
			}
			if (currentRowSum > largestRowSum) {
				largestRowSum = currentRowSum;
			}
			if (currentColSum > largestColSum) {
				largestColSum = currentColSum;
			}
			currentRowSum = 0;
			currentColSum = 0;
		}

		System.out.println("Largerst row sum: " + largestRowSum);
		System.out.println("Largest col sum: " + largestColSum);
		System.out.println(
				"Largest row sum is " + (largestRowSum > largestColSum ? "> " : "<=") + "than Largest Col sum");
	}
}


public class Problem7 {

	public static void main(String[] args) {
		int[][] matrix = { { 11, 12, 13, 14, 15, 16, }, { 21, 22, 23, 24, 25, 26, }, { 31, 32, 33, 34, 35, 36, },
				{ 41, 42, 43, 44, 45, 46, }, { 51, 52, 53, 54, 55, 56, }, { 61, 62, 63, 64, 65, 66 } };

		int sum = 0;
		int rowSum = 0;
		for (int i = 0; i < matrix.length * matrix.length; i++) {

			int row = i / matrix.length;
			int col = i % matrix.length;
			if ((row + col) % 2 == 0) {
				if (col == matrix[row].length - 1) {
					System.out.print(matrix[row][col] + " ");
				} else {
					System.out.print(matrix[row][col] + ",");
				}
				rowSum += matrix[row][col];
			} else {
				System.out.print(" ,");
			}

			if (col == matrix[row].length - 1) {
				System.out.print("sum of the row " + rowSum);
				sum += rowSum;
				rowSum = 0;
				System.out.println();
			}
		}
		System.out.println("Sum of the elements " + sum);
	}
}

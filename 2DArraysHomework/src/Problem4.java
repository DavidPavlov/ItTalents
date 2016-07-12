
public class Problem4 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int[][] resultMatrix = new int[arr.length][arr.length];

		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				resultMatrix[j][resultMatrix.length - (1 + i)] = arr[i][j];
			}
		}

		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix.length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

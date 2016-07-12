import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Enter the size of the matrix");
			size = sc.nextInt();
		} while (size < 0);

		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int row = 0;
		int col = 0;

		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[row][col] + " ");
			row++;
			col++;
		}

		System.out.println();

		row = 0;
		col = matrix.length - 1;
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[row][col] + " ");
			row++;
			col--;
		}
		sc.close();
	}
}

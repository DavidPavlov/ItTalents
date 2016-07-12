import java.util.Scanner;

public class TicTacToe {

	private static final int SIZE = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] matrix = new char[SIZE][SIZE];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = '-';
			}
		}

		boolean isPlayerOneWon = false;
		boolean isPlayerTwoWon = false;
		printMatrix(matrix);
		while (true) {

			playerOneMoves(matrix, sc);
			printMatrix(matrix);
			isPlayerOneWon = checkIfWins(matrix, 'X');
			if (isPlayerOneWon) {
				System.out.println("Player one Wins");
				break;
			}
			if (checkIfNoWinner(matrix)) {
				System.out.println("No winner");
				break;
			}

			playerTwoMoves(matrix, sc);
			printMatrix(matrix);
			isPlayerTwoWon = checkIfWins(matrix, 'O');
			if (isPlayerTwoWon) {
				System.out.println("Player two wins");
				break;
			}
			if (checkIfNoWinner(matrix)) {
				System.out.println("No winner");
				break;
			}

		}
	}

	public static void playerOneMoves(char[][] matrix, Scanner sc) {
		System.out.println("Player one turn");
		String[] coordinates = sc.nextLine().split("[^0-9-]+");
		int row = Integer.parseInt(coordinates[0]) - 1;
		int col = Integer.parseInt(coordinates[1]) - 1;
		while ((row >= matrix.length || col >= matrix.length) || (row < 0 || col < 0)) {
			System.out.println("Invalid coordinates, enter again !");
			coordinates = sc.nextLine().split("[^0-9-]+");
			row = Integer.parseInt(coordinates[0]) - 1;
			col = Integer.parseInt(coordinates[1]) - 1;
		}
		while (matrix[row][col] != '-') {
			System.out.println("The cell is already played, enter again !");
			coordinates = sc.nextLine().split("[^0-9-]+");
			row = Integer.parseInt(coordinates[0]) - 1;
			col = Integer.parseInt(coordinates[1]) - 1;
		}
		matrix[row][col] = 'X';
	}

	public static void playerTwoMoves(char[][] matrix, Scanner sc) {
		System.out.println("Player two turn");
		String[] coordinates = sc.nextLine().split("[^0-9-]+");
		int row = Integer.parseInt(coordinates[0]) - 1;
		int col = Integer.parseInt(coordinates[1]) - 1;
		while ((row >= matrix.length || col >= matrix.length) || (row < 0 || col < 0)) {
			System.out.println("Invalid coordinates, enter again !");
			coordinates = sc.nextLine().split("[^0-9-]+");
			row = Integer.parseInt(coordinates[0]) - 1;
			col = Integer.parseInt(coordinates[1]) - 1;
		}
		while (matrix[row][col] != '-') {
			System.out.println("The cell is already played, enter again !");
			coordinates = sc.nextLine().split("[^0-9-]+");
			row = Integer.parseInt(coordinates[0]) - 1;
			col = Integer.parseInt(coordinates[1]) - 1;
		}
		matrix[row][col] = 'O';
	}

	public static void printMatrix(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean checkIfWins(char[][] matrix, char ch) {
		boolean isWinning = false;
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == ch) {
					count++;
				}
			}
			if (count == SIZE) {
				isWinning = true;
				break;
			}
			count = 0;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == ch) {
					count++;
				}
			}
			if (count == SIZE) {
				isWinning = true;
				break;
			}
			count = 0;
		}

		int row = 0;
		int col = 0;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[row][col] == ch) {
				count++;
			}
			row++;
			col++;
		}
		if (count == SIZE) {
			isWinning = true;
		}
		count = 0;
		row = 0;
		col = matrix.length - 1;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[row][col] == ch) {
				count++;
			}
			row++;
			col--;
		}
		if (count == SIZE) {
			isWinning = true;
		}

		return isWinning;
	}

	public static boolean checkIfNoWinner(char[][] matrix) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == '-') {
					count++;
				}
			}
		}
		flag = count == 0 ? true : false;
		return flag;
	}

}

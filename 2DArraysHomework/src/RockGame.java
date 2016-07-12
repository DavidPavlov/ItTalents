import java.util.Random;
import java.util.Scanner;

public class RockGame {

	private static final char PLAYER = '웃';
	private static final char ROCK = 'O';
	private static final char BUSH = 'w';
	private static final char EXIT = 'E';
	private static int size;
	private static int row;
	private static int col;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter the size of the map. The minimum size is 10 !");
			size = Integer.parseInt(sc.nextLine());
		} while (size < 10);

		char[][] map = new char[size][size];

		int dificulty = 0;
		do {
			System.out.println("Enter the dificulty that you want (EASY MEDIUM HARD)");
			String dif = sc.nextLine();
			switch (dif) {
			case "EASY":
				dificulty = 6;
				break;
			case "MEDIUM":
				dificulty = 5;
				break;
			case "HARD":
				dificulty = 4;
				break;
			default:
				dificulty = -1;
			}
		} while (dificulty < 3);

		createMap(map, dificulty);
		printMap(map);
		row = 0;
		col = 0;
		System.out.println("Use R - Right L - Left U - Up D - Down");
		while (true) {
			System.out.println("Move.");
			String dir = sc.nextLine();
			if (move(map, dir)) {
				printMap(map);
			}
			if (map[map.length - 1][map.length - 1] == 'O') {
				System.out.println("You win !!!");
				break;
			}
			if (checkIfNoOption(map)) {
				System.out.println("The rock is stuck. GAME OVER !!!");
				break;
			}

		}
		sc.close();
	}

	private static boolean checkIfNoOption(char[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[i][j] == ROCK) {
					if (i == 0 || j == 0) {
						return true;
					}
					if ((j == map.length - 1 && map[i + 1][j] == 'w') || (i == map.length - 1 && map[i][j + 1] == 'w')
							|| (j == map.length - 1 && map[i - 1][j] == 'w')
							|| (i == map.length - 1 && map[i][j - 1] == 'w')) {
						return true;

					} else if (i < map.length - 1 && j < map.length - 1) {
						if ((map[i + 1][j] == 'w' && map[i][j + 1] == 'w')
								|| (map[i + 1][j] == 'w' && map[i][j - 1] == 'w')
								|| (map[i - 1][j] == 'w' && map[i][j + 1] == 'w')
								|| (map[i - 1][j] == 'w' && map[i][j - 1] == 'w')) {
							return true;
						}
					} else {
						return false;
					}
				}
			}
		}

		return false;
	}

	private static boolean move(char[][] map, String dir) {
		switch (dir) {
		case "U":
			if (row - 1 < 0) {
				System.out.println("Invalid Direction");
				return false;
			}
			if (map[row - 1][col] == 'w') {
				System.out.println("There is an obstacle in that direction");
				return false;
			}
			if (map[row - 1][col] == 'O' && row - 2 < 0) {
				System.out.println("Invalid Direction");
				return false;
			}
			if (map[row - 1][col] == 'O' && map[row - 2][col] == 'w') {
				System.out.println("There is an obstacle in that direction");
				return false;
			} else {
				if (map[row - 1][col] == ROCK) {
					map[row - 2][col] = ROCK;
				}
				map[row - 1][col] = PLAYER;
				map[row][col] = '_';
				row--;
				return true;
			}
		case "D":
			if (row + 1 >= map.length) {
				System.out.println("Invalid Direction");
				return false;
			}
			if (map[row + 1][col] == 'w') {
				System.out.println("There is an obstacle in that direction");
				return false;
			}
			if (map[row + 1][col] == 'O' && row + 2 >= map.length) {
				System.out.println("Invalid Direction");
				return false;
			}
			if (map[row + 1][col] == 'O' && map[row + 2][col] == 'w') {
				System.out.println("There is an obstacle in that direction");
				return false;
			} else {
				if (map[row + 1][col] == ROCK) {
					map[row + 2][col] = ROCK;
				}
				map[row + 1][col] = PLAYER;
				map[row][col] = '_';
				row++;
				return true;
			}
		case "R":
			if (col + 1 >= map.length) {
				System.out.println("Invalid Direction");
				return false;
			}
			if (map[row][col + 1] == 'w') {
				System.out.println("There is an obstacle in that direction");
				return false;
			}
			if (map[row][col + 1] == 'O' && col + 2 >= map.length) {
				System.out.println("Invalid Direction");
				return false;
			}
			if (map[row][col + 1] == 'O' && map[row][col + 2] == 'w') {
				System.out.println("There is an obstacle in that direction");
				return false;
			} else {
				if (map[row][col + 1] == ROCK) {
					map[row][col + 2] = ROCK;
				}
				map[row][col + 1] = PLAYER;
				map[row][col] = '_';
				col++;
				return true;
			}
		case "L":
			if (col - 1 < 0) {
				System.out.println("Invalid Direction");
				return false;
			}
			if (map[row][col - 1] == 'w') {
				System.out.println("There is an obstacle in that direction");
				return false;
			}
			if (map[row][col - 1] == 'O' && col - 2 < 0) {
				System.out.println("Invalid Direction");
				return false;
			}
			if (map[row][col - 1] == 'O' && map[row][col - 2] == 'w') {
				System.out.println("There is an obstacle in that direction");
				return false;
			} else {
				if (map[row][col - 1] == ROCK) {
					map[row][col - 2] = ROCK;
				}
				map[row][col - 1] = PLAYER;
				map[row][col] = '_';
				col--;
				return true;
			}
		default:
			System.out.println("Invalid Direction");
			return false;
		}
	}

	private static void createMap(char[][] map, int dificulty) {

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				map[i][j] = '_';
			}
		}
		Random rnd = new Random();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length / dificulty; j++) {
				int col = rnd.nextInt(map.length);
				map[i][col] = BUSH;
			}
		}
		map[map.length - 1][map.length - 1] = EXIT;
		map[0][0] = PLAYER;
		map[1][1] = ROCK;
		map[0][1] = '_';
		map[1][0] = '_';
	}

	private static void printMap(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;

public class Problem21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();

		while (num < 1 || num > 51) {
			System.out.println("Invalid number. Enter again:");
			num = sc.nextInt();
		}

		switch (num) {
		case 1:
			System.out.println("2 Clubs");
		case 2:
			System.out.println("2 Diamonds");
		case 3:
			System.out.println("2 Hearts");
		case 4:
			System.out.println("2 Spades");
		case 5:
			System.out.println("3 Clubs");
		case 6:
			System.out.println("3 Diamonds");
		case 7:
			System.out.println("3 Hearts");
		case 8:
			System.out.println("3 Spades");
		case 9:
			System.out.println("4 Clubs");
		case 10:
			System.out.println("4 Diamonds");
		case 11:
			System.out.println("4 Hearts");
		case 12:
			System.out.println("4 Spades");
		case 13:
			System.out.println("5 Clubs");
		case 14:
			System.out.println("5 Diamonds");
		case 15:
			System.out.println("5 Hearts");
		case 16:
			System.out.println("5 Spades");
		case 17:
			System.out.println("6 Clubs");
		case 18:
			System.out.println("6 Diamonds");
		case 19:
			System.out.println("6 Hearts");
		case 20:
			System.out.println("6 Spades");
		case 21:
			System.out.println("7 Clubs");
		case 22:
			System.out.println("7 Diamonds");
		case 23:
			System.out.println("7 Hearts");
		case 24:
			System.out.println("7 Spades");
		case 25:
			System.out.println("8 Clubs");
		case 26:
			System.out.println("8 Diamonds");
		case 27:
			System.out.println("8 Hearts");
		case 28:
			System.out.println("8 Spades");
		case 29:
			System.out.println("9 Clubs");
		case 30:
			System.out.println("9 Diamonds");
		case 31:
			System.out.println("9 Hearts");
		case 32:
			System.out.println("9 Spades");
		case 33:
			System.out.println("10 Clubs");
		case 34:
			System.out.println("10 Diamonds");
		case 35:
			System.out.println("10 Hearts");
		case 36:
			System.out.println("10 Spades");
		case 37:
			System.out.println("J Clubs");
		case 38:
			System.out.println("J Diamonds");
		case 39:
			System.out.println("J Hearts");
		case 40:
			System.out.println("J Spades");
		case 41:
			System.out.println("D Clubs");
		case 42:
			System.out.println("D Diamonds");
		case 43:
			System.out.println("D Hearts");
		case 44:
			System.out.println("D Spades");
		case 45:
			System.out.println("K Clubs");
		case 46:
			System.out.println("K Diamonds");
		case 47:
			System.out.println("K Hearts");
		case 48:
			System.out.println("K Spades");
		case 49:
			System.out.println("A Clubs");
		case 50:
			System.out.println("A Diamonds");
		case 51:
			System.out.println("A Hearts");
		case 52:
			System.out.println("A Spades");
		default:
			break;
		}
		sc.close();
	}
}

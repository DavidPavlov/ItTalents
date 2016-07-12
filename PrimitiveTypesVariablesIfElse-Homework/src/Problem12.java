import java.util.Scanner;

//it's a shitty solution with if/else statements only.
public class Problem12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the dates");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();

		if (day < 30 && month != 2) {
			System.out.println(String.format("Next date is: %d, %d, %d", day + 1, month, year));
		} else if (day == 30) {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println(String.format("Next date is: %d, %d, %d", 1, month + 1, year));
			} else {
				System.out.println(String.format("Next date is: %d, %d, %d", day + 1, month, year));
			}
		} else if (day == 31) {
			if (month != 12) {
				System.out.println(String.format("Next date is: %d, %d, %d", 1, month + 1, year));
			} else {
				System.out.println(String.format("Next date is: %d, %d, %d", 1, 1, year + 1));
			}
		} else {
			if (day < 28) {
				System.out.println(String.format("Next date is: %d, %d, %d", day + 1, month, year));
			} else if (day == 28) {
				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							System.out.println(String.format("Next date is: %d, %d, %d", day + 1, month, year));
						} else {
							System.out.println(String.format("Next date is: %d, %d, %d", 1, month + 1, year));
						}
					} else {
						System.out.println(String.format("Next date is: %d, %d, %d", day + 1, month, year));
					}
				} else {
					System.out.println(String.format("Next date is: %d, %d, %d", 1, month + 1, year));
				}
			} else {
				System.out.println(String.format("Next date is: %d, %d, %d", 1, month + 1, year));
			}
		}

	}
}

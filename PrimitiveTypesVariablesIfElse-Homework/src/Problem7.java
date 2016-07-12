import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the hour: ");
		int hour = sc.nextInt();

		System.out.println("Enter the amount of money:");
		double money = sc.nextDouble();

		System.out.println("Am i sick ?");
		boolean sick = sc.nextBoolean();

		if (sick) {
			if (money > 0) {
				System.out.println("I will not go out and i will buy medicine.");
			} else {
				System.out.println("I will stay home and drink tea.");
			}
		} else {
			if (money > 10 && hour > 8 && hour < 22) {
				System.out.println("I will go to the cinema with friends");
			} else if (money < 10 && hour > 8 && hour < 22) {
				System.out.println("I will go to drink coffee with friends");
			} else {
				System.out.println("I will stay home");
			}
		}
	}
}

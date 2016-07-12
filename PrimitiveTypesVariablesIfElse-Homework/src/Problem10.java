import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the volume of the tank");
		int volume = sc.nextInt();

		int bothBuckets = volume / 5;
		volume = volume % 5;
		System.out.println(String.format("%d times with 2 liters", bothBuckets));
		System.out.println(String.format("%d times with 3 liters", bothBuckets));
		if (volume <= 2) {
			System.out.println("Additional 1 bucket of 2 liters");
		} else if (volume == 3) {
			System.out.println("Additional 1 bucket of 3 liters");
		} else {
			System.out.println("Additional 2 buckets of 2 liters or 1 bucket of 2 liters and a bucket of 3 liters");
		}

	}
}

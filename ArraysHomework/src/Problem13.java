import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter a positive number");
			num = sc.nextInt();
		}

		int copy = num;
		int count = 0;
		while (copy > 0) {
			copy /= 2;
			count++;
		}

		int[] binary = new int[count];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = num % 2;
			num /= 2;
		}
		int index = binary.length - 1;
		for (int i = 0; i < binary.length / 2; i++) {
			int temp = binary[i];
			binary[i] = binary[index];
			binary[index] = temp;
			index--;
		}
		for (int i = 0; i < binary.length; i++) {
			System.out.print(binary[i]);
		}
		sc.close();
	}
}

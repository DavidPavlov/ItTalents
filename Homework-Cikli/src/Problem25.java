import java.math.BigInteger;
import java.util.Scanner;

public class Problem25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int i = 1;

		BigInteger product = new BigInteger("1");
		BigInteger increment = new BigInteger("1");

		do {
			product = product.multiply(increment);
			increment = increment.add(BigInteger.ONE);
			i++;
		} while (i <= num);

		System.out.println(product);
		sc.close();
	}
}

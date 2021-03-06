import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		int a = sc.nextInt();

		System.out.println("Please enter B:");
		int b = sc.nextInt();

		int sum = a + b;
		int diference = a - b;
		long product = a * b;
		int quotient = a / b;
		int modul = a % b;

		System.out.println(String.format("Sum of %d and %d is: %d", a, b, sum));
		System.out.println(String.format("Diference of %d and %d is: %d", a, b, diference));
		System.out.println(String.format("Product of %d and %d is: %d", a, b, product));
		System.out.println(String.format("Quotient of %d and %d is: %d", a, b, quotient));
		System.out.println(String.format("Modul of %d and %d is: %d", a, b, modul));

		// For floating point numbers ahead
		System.out.println("Please enter C:");
		float c = sc.nextFloat();

		System.out.println("Please enter D:");
		float d = sc.nextFloat();

		float sumF = c + d;
		float diferenceF = c - d;
		float productF = c * d;
		float quotientF = c / d;
		float modulF = c % d;

		System.out.println(String.format("Sum of %.2f and %.2f is: %.2f", c, d, sumF));
		System.out.println(String.format("Diference of %.2f and %.2f is: %.2f", c, d, diferenceF));
		System.out.println(String.format("Product of %.2f and %.2f is: %.2f", c, d, productF));
		System.out.println(String.format("Quotient of %.2f and %.2f is: %.2f", c, d, quotientF));
		System.out.println(String.format("Modul of %.2f and %.2f is: %.2f", c, d, modulF));

	}
}

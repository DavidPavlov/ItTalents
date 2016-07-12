
public class Fibonacci {
	public static void main(String[] args) {
		int n = 46;
		int[] arr = new int[n];
		System.out.println(fib(arr, n));
	}

	static int fib(int[] arr, int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		} else {
			if (arr[n - 1] == 0) {
				int newValue = fib(arr, n - 1) + fib(arr, n - 2);
				arr[n - 1] = newValue;
				return newValue;
			} else {
				return arr[n - 1];
			}
		}
	}
}

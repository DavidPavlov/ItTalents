
public class Problem14 {

	public static void main(String[] args) {
		long n = factorial(5);
		System.out.println(n);
	}

	static long factorial(int n) {
		long fac = 1;
		for (int i = 2; i <= n; i++) {
			fac *= i;
		}
		return fac;
	}
}

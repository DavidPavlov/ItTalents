import java.util.Arrays;

public class Problem12 {

	public static void main(String[] args) {

		int[] arr = generateNumsArray(23);
		System.out.println(Arrays.toString(arr));

	}

	static int[] generateNumsArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		return array;
	}
}

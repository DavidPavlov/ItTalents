import java.util.Arrays;

public class Problem13 {

	public static void main(String[] args) {

		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 5, 4, 3, 2, 1 };

		int[] arr = arrayConcat(first, second);
		System.out.println(Arrays.toString(arr));
	}

	static int[] arrayConcat(int[] first, int[] second) {
		int[] megaArray = new int[first.length + second.length];
		int count = 0;
		for (int i = 0; i < first.length; i++) {
			megaArray[count] = first[i];
			count++;
		}
		for (int i = 0; i < second.length; i++) {
			megaArray[count] = second[i];
			count++;
		}
		return megaArray;
	}
}


public class Problem04 {

	public static void main(String[] args) {

		int[] array = { 6, 27, -1, 5, 7, 7, 5, -1, 27, 6 };
		int count = array.length - 1;
		boolean isMirror = true;
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[count]) {
				isMirror = false;
				break;
			}
			count--;
		}
		System.out.println(isMirror ? "The array is mirrored" : "Not mirrored");
	}
}

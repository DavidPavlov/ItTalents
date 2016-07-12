import java.util.Arrays;

public class Problem14 {

	public static void main(String[] args) {

		double[] array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > -3 && array[i] < 3) {
				count++;
			}
		}
		double[] selected = new double[count];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > -3 && array[i] < 3) {
				selected[index] = array[i];
				index++;
			}
		}

		for (int i = 0; i < selected.length; i++) {
			if (i == selected.length - 1) {
				System.out.print(selected[i]);
				break;
			}
			System.out.print(selected[i] + "; ");
		}
		System.out.println();

		// MOST ELEGANT WAY
		Arrays.stream(array).filter(a -> a > -3 && a < 3).forEach(element -> System.out.print(element + " "));
	}
}

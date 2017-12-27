package lesson3;

public class Task2 {

	public static void main(String[] args) {

		double arrayA[] = { -1.49, 0.50, -4.70, -1.08, -4.95, 1.14, -2.46, 2.61, -3.14, 4.35, 0.52, 1.24, 4.29, -2.39,
				-3.95, -4.91, -4.35, 3.60, 2.50, -0.21 };

		int j = 0;
		for (int i1 = 1; i1 < arrayA.length; i1 = i1 + 2) {
			if (arrayA[i1] > 0) {
				j++;
			}
		}
		double arrayB[] = new double[j];
		double sum = 0;

		for (int i1 = 1, i2 = 0; i1 < arrayA.length; i1 = i1 + 2) {
			if (arrayA[i1] > 0) {
				arrayB[i2] = arrayA[i1];
				sum = sum + arrayB[i2] * arrayB[i2];
				i2++;

			}

		}
		System.out.println("ArrayA:");
		for (int i1 = 0; i1 < arrayA.length; i1++) {
			System.out.print(arrayA[i1] + " ");
		}
		System.out.println(" ");
		System.out.println("ArrayB:");
		for (int i2 = 0; i2 < arrayB.length; i2++) {
			System.out.print(arrayB[i2] + " ");

		}
		System.out.println(" ");
		System.out.println("sum = " + Math.round(sum * 100d) / 100d);

	}
}

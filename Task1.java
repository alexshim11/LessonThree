package lesson3;

public class Task1 {

	public static void main(String[] args) {

		int massive[] = { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };

		int max = massive[0];
		for (int i = 0; i < massive.length; i++) {
			if (massive[i] > max) {
				max = massive[i];

			}

		}
		System.out.println(max);
		System.out.println("");

		double j = 0;
		for (int i = 0; i < massive.length; i++) {
			j = (double) massive[i] / max;
			// ÎÊÐÓÃËÅÍÈÅ!!!
			j = (double) Math.round(j * 100d) / 100d;
			System.out.print(" " + j);
		}
	}
}
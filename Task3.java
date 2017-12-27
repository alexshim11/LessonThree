package lesson3;

public class Task3 {

	public static void main(String[] args) {

		int array[][] = { { 18, 11, 5, 4, 11 }, { 18, 1, 6, 7, 2 }, { 2, 14, 14, 10, 12 }, { 13, 5, 11, 19, 19 },
				{ 6, 6, 13, 13, 16 }, { 0, 17, 14, 6, 0 }, { 14, 0, 2, 11, 7 } };

		int buffer = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++) {
				buffer = array[1][j];
				array[1][j] = array[6][j];
				array[6][j] = buffer;

			}

		System.out.println(" ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();

		}

	}
}

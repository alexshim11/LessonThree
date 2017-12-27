package lesson3;

public class Task4 {

	public static void main(String[] args) {

		int array[][] = new int[3][3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int) (Math.random() * 100);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();

		}
		System.out.print("Max[0][j]= ");
		for (int j = 0; j < array.length; j++) {
			int max = array[0][j];
			for (int i = 0; i < array.length; i++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
			System.out.print(max + " ");
		}

	}
}

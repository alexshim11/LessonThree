package lesson3;

public class Task5 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];
		int value = 3;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 5);
				System.out.print(arr[i][j] + " ");
				if (arr[i][j] == value) {
					k++;
				}
			}
			System.out.println();
		}
		System.out.println(k);
	}
}
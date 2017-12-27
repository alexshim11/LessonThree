package lesson3;

public class Task6 {

	public static void main(String[] args) {

		// создаем массив
		int arr[][] = new int[100][100];
		// заполняем массив
		arrayRnd(arr);
		// счетчик
		searchValue(arr);
		// выводим счетчик
		System.out.println(searchValue(arr));

	}

	// метод для заполнения массива
	public static void arrayRnd(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) (Math.random() * 199);
			}
		}
	}

	// находим количество всех двузначных чисел, у которых сумма цифр кратна 2
	public static int searchValue(int[][] arr) {
		int firstNumber = 0;
		int secondNumber = 0;
		int amount = 0;
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > 0 && arr[i][j] < 100) {
					firstNumber = arr[i][j] / 10;
					secondNumber = arr[i][j] % 10;
					amount = firstNumber + secondNumber;
					if (amount % 2 == 0) {
						value++;
					}
				}

			}
		}
		return value;

	}

}

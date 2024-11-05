package week1.day2;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 7,7, 5, 9, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {
						System.out.println(arr[i]);
						arr[j] = 0;
						break;
					}

				}
			}
		}

	}

}

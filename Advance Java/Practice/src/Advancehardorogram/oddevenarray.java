package Advancehardorogram;

public class oddevenarray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				System.out.println(arr[i] + " is even no");

			} else {
				System.out.println(arr[i] + " is odd no");

			}

		}

	}
}

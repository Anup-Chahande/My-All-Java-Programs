package Pattrens;

public class Thirteen {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {

				System.out.print(" ");
			}
			for (int c = 1; c <= i; c++) {

				if (i == 2 && c == 2) {
					System.out.print(" ");

				}

				else if (i == 3 && c == 2 || i == 3 && c == 3) {
					System.out.print(" ");

				} else if (i == 4 && c == 2 || i == 4 && c == 3 || i == 4 && c == 4) {
					System.out.print(" ");

				}

				else {
					System.out.print("*");
				}
			}
			for (int k = 2; k <= i; k++) {
				if (i == 3 && k == 2 || i == 4 && k == 3 || i == 4 && k == 2) {
					System.out.print(" ");

				}

				else {
					System.out.print("*");
				}
			}

			System.out.println();
		}

	}
}

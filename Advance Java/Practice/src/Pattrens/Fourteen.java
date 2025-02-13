package Pattrens;

public class Fourteen {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {

			for (int j = 2; j <= i; j++) {

				System.out.print(" ");
			}
			for (int c = 4; c >= i; c--) {
				if (i == 1 && c == 2 || i == 1 && c == 3 || i == 1 && c == 1) {
					System.out.print(" ");
				}

				else if (i == 2 && c == 2 || i == 2 && c == 3 || i == 3 && c == 3) {
					System.out.print(" ");
				} else {

					System.out.print("*");
				}
			}

			for (int c = 3; c >= i; c--) {
				if (i == 1 && c == 3 || i == 1 && c == 2 || i == 2 && c == 3) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}

}

package Pattrens;

public class A {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= i; c++) {
				if (i == 2 && c == 2) {
					System.out.print(" ");
				} else if (i == 4 && c == 2 || i == 4 && c == 3 || i == 4 && c == 4) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}
			}
			for (int n = 2; n <= i; n++) {
                  if(i==4 && n==2 || i==4 && n==3) {
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

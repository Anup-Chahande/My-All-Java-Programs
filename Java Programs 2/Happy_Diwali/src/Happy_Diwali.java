
public class Happy_Diwali {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i == 1 && j > 1 && j < 5 || i == 2 && j > 1 && j < 5 || i == 4 && j > 1 && j < 5
						|| i == 5 && j > 1 && j < 5) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
				System.out.println();

			
		}
System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= i; c++) {
				if (i == 2 && c == 2 || i == 4 && c > 1 || i == 5 && c > 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");

				}
			}
			for (int j = 2; j <= i; j++) {
				if (i == 4 && j < 4 || i == 5 && j < 5) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}

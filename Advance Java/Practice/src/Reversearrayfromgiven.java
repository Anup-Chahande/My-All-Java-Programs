import java.util.Scanner;

public class Reversearrayfromgiven {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter Range");
		int arraysize = sc.nextInt();
		int arr[] = new int[arraysize];
		for (int i = 0; i < arraysize; i++) {

			System.out.println("Enter array Element");
			arr[i] = sc.nextInt();

		}
		System.err.println("Your array is ");
		for (int i = 0; i < arraysize; i++) {

			System.out.print(" " + arr[i]);

		}
		System.out.println();
		System.err.println("Your  Reverse array is ");
		for (int i = arraysize-1; i>=0; i--) {

			System.out.print(" " + arr[i]);

		}

	}
}

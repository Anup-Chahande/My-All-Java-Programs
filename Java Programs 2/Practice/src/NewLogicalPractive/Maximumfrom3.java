package NewLogicalPractive;

import java.util.Scanner;

public class Maximumfrom3 {
	public static void main(String[] args) {
		System.out.println("Enter the first No");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the Second No");

		int num2 = sc.nextInt();
		System.out.println("Enter the Third No");

		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + "is greter");
		}
		
		else if(num1<num2 && num2>num3) {
			System.out.println(num2 + "is greter");
		}

		else if(num3>num2 && num3>num1) {
			System.out.println(num3 + " is greter");
		}

	}

}

package NewLogicalPractive;

import java.util.Scanner;

public class zeropositivenegative {
	public static void main(String[] args) {
		System.out.println("Enter the first No");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
	if(num1>0) {
		System.out.println(num1 + " is Positive");
	}
	
	if(num1==0) {
		System.out.println(num1 + " is Zero");
	}
	
	if(num1<0) {
		System.out.println(num1 + " is Negative");
	}
	
	
	}
}

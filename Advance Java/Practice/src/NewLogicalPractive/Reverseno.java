package NewLogicalPractive;

import java.util.Scanner;

public class Reverseno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	while(num>0) {
		int rem = num%10;
		System.out.print(rem);
		num=num/10;
		
	}
}
}

package NewLogicalPractive;

import java.util.Scanner;

public class Fibonalaci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=0;
	//0112358
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range");

	int num = sc.nextInt();
	for(int i=0;i<num;i++) {
		System.out.print(" " + a);
	
		c=a+b;
		a=b;
		b=c;
		
	}
}
}

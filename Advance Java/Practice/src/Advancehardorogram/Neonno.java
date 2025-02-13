package Advancehardorogram;

import java.util.Scanner;

public class Neonno {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int square = num;
		int rem=0;
		int sum=0;
		
		square = num * num;
		while(square!=0) {
		rem=square%10;
		sum=sum+rem;
		square=square/10;
		

	}

		if(num==sum) {
			System.out.println(num + " it is neon no");
		}
		else {
			System.out.println(num + " it is not neon no ");
		}
	}
}

package Advancehardorogram;

import java.util.Scanner;

public class Strongno {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int num =sc.nextInt();
		int copy=num;
		int sum=1;
		int rem=0;
		int strongno=0;
		while (copy!=0) {
			rem=copy%10;
			for(int i=1;i<=rem;i++) {
				sum =sum*i;
				
			}
			strongno=strongno+sum;
			copy=copy/10;
            sum=1;

		

			
		}
		if(num==strongno) {
			
			System.out.println(num + " is a strong no ");
		}
		else {
			System.out.println(num + " is not a strong no");
		}
		
	}
}

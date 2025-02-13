package NewLogicalPractive;

import java.util.Scanner;

public class countofdigit {
	public static void main(String[] args) {
		int rem=0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int num = sc.nextInt();
		while(num>0) {
			rem=num%10;
            count++;
           num=num/10;
		
			
		}
	System.out.println("Sum of Digit is " + count);	
	}


	}

	
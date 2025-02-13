package Advancehardorogram;

import java.util.Scanner;
// check sum of diviser addition match no ec ;- 1,3,2=6
public class Perfectmo {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			
		}

		if(num==sum) {
			System.out.println(num + " Is a perfect no");
		}
		else {
			System.out.println(num + " Is not a perfect no");
		}
	}
}

package NewLogicalPractive;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
		System.out.println("Enter the No");
		Scanner sc= new Scanner(System.in);
		 int num1 =sc.nextInt();
        int count=0;
		 for(int i=1;i<=num1;i++) {
			 if(num1%i==0) {
				 count++;
				 
			 }
			
			 
		 }
		 if(count==2) {
			 System.out.println(num1 + " It is prime no");
			 
		 }
		 else {
			 System.out.println(num1 + " It is not prime no");

		 }
}
}

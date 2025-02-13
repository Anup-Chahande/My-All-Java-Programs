package LogicalPrograms;

import java.util.Scanner;

public class countofdgit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int num = sc.nextInt();
	int rem=0;
	int count=0;
	while(num!=0) {
		rem=num%10;

		System.out.print(rem);
		
		num=num/10;
		
		
	}
	
	
	
	
}
}

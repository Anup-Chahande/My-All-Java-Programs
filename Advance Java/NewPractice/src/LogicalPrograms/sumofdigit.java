package LogicalPrograms;

import java.util.Scanner;

public class sumofdigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int num = sc.nextInt();
	int rem=0;
	int sum=0;
	while(num!=0) {
		
		rem=num%10;
		sum=rem+sum;
		num=num/10;
		
		
		
	}
	System.out.println(sum);
	
}
}

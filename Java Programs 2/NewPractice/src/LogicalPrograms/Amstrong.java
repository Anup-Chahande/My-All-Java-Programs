package LogicalPrograms;

import java.util.Scanner;

public class Amstrong {
public static void main(String[] args) {
	int rem=0;
	int temp=0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int num = sc.nextInt();
	int copy=num;

	while(num!=0) {
		
		rem =num%10;
		temp=(rem*rem*rem)+temp;
		num=num/10;
		
	}
	if(copy==temp) {
		
		System.out.println("it is a Amstrong no " + copy);
	}
	
	else {
		
		
		System.out.println("it is not a Amstrong no " + copy);

	}
	
	
	
	
	
	
	
}
}

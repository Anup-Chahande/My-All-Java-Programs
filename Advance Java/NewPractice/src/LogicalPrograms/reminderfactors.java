package LogicalPrograms;

import java.util.Scanner;

public class reminderfactors {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int num = sc.nextInt();
	for(int i=1;i<=num;i++) {
		
		
		if(num%i==0) {
			
			System.out.println("reminder of given no is =" + i);
		}
		
		
		
		
	}
	
}
}

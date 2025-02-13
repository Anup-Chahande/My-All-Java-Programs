package LogicalPrograms;

import java.util.Scanner;

//0112358
public class fibonalci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range");
	int num = sc.nextInt();
	int a=0;
	int b=1;
	int c=0;
	
	for(int i=1;i<=num;i++) {
		System.out.print(a);
		c=a+b;
		a=b;
		b=c;
		
		
		
	}
	
	
	
}
	
	
	
}

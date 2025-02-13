package NewLogicalPractive;

import java.util.Scanner;

public class Factorail {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	int Factorial=1;
	for(int i=1;i<=num;i++) {
		
		
		Factorial = i*Factorial;
		
	}
	 System.out.println("Factorial of given no is " + Factorial);
	 
	 
}
	
}

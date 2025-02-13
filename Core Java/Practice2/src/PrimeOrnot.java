import java.util.Scanner;
public class PrimeOrnot {
void m1() {
	System.out.println("Enter the no");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(num % 1==0 && num % num ==0) {
		
		
		System.out.println("Number is prime");
		
	}
	else {System.out.println("Num is odd ");}
	
}
	
	public static void main(String[] args) {
		PrimeOrnot or = new PrimeOrnot();
		or.m1();
	}
	
	
}

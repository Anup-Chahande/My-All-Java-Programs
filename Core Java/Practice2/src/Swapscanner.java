import java.util.Scanner;

public class Swapscanner {
int a;
int b;

 void input() {
	Scanner no1 = new Scanner(System.in);
	System.out.println("Enter The Value of a");	
	a = no1.nextInt();
		
		Scanner no2 = new Scanner(System.in);
		System.out.println("Enter The Value of b");	

		b= no2.nextInt();
		
		System.out.println("Before Swaping value of a is " + a + " and b is " + b);
}
 
 void swap () {
	 int temp = b;
	 b=a;	
	 a=temp;
		 
	 
	 System.out.println("After Swaping value of a is " + a + " and b is " + b);
	 
 }
 
 
 public static void main(String[] args) {
	 Swapscanner s = new Swapscanner();
	 s.input();
	 s.swap();
}
}
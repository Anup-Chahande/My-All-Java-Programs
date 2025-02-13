import java.util.Scanner;

public class Revall {
	void m1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");		

		int size = sc.nextInt();
 String a[]  = new String [size];
		
		for(int i = 0;i<a.length;i++){
			System.out.println("Enter an element");
           a[i] = sc.next();
			
		}
		System.out.println("your reverse array is " );

		for(int b = size-1;b>=0;b--){
	           System.out.print( a[b] + " ");
				
			}
		
		
	}
	public static void main(String[] args) {
		Revall c = new Revall();
		c.m1();
	}
}

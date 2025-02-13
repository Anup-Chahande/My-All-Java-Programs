import java.util.Scanner;
public class Reversear {

	void m1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");		

		int size = sc.nextInt();
 int a[]  = new int [size];
		
		for(int i = 0;i<a.length;i++){
			System.out.println("Enter an element");
           a[i] = sc.nextInt();
			
		}
		System.out.println("your reverse array is " );

		for(int b = size-1;b>=0;b--){
	           System.out.print( a[b] + " ");
				
			}
		
		
	}
	public static void main(String[] args) {
		Reversear sc = new Reversear();
		sc.m1();
	
	
	
}
}

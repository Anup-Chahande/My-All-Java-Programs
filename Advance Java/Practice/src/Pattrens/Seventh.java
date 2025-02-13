package Pattrens;

public class Seventh {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++) {
		for(int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int c=1;c<=i;c++) {
			
			System.out.print("*");
			
		}
		
		System.out.println();
	}
	
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int c=4;c>=i;c--) {
			
			System.out.print("*");
			
		}
		
		System.out.println();
	}
	
	
	
	
}
	
	
}

package LogicalPrograms;

public class Pattrenn1 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		
		for(int c=3;c>=i;c--) {
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++) {
			if(i==2 && j==4 || i==3 && j>2 || i==4 && j>1){
				System.out.print("");
			} 
			else {
			
			System.out.print("*");
			
		}}
		
		
		System.out.println();
		
	}}		
		
	

}

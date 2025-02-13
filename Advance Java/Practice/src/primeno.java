import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
           int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int num = sc.nextInt();

		for(int i=1;i<=num;i++) {
		        if(num%i==0) {
		        	if(count==2) {
						System.out.println("It is a prime no");

		        		
		        		
		        		
		        	}
		        	else {
						System.out.println("it is notl prime no");
						
					}
					
		        	
		        	
		        }	
		
				
				
			}
		
			
			
			
		}
		


}

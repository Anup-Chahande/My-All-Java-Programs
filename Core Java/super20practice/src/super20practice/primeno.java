package super20practice;
import java.util.Scanner;
public class primeno {
public static void main(String[] args) {
	int temp = 0;
	System.out.println("Enter the no");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
         for(int i = 1;i<=num;i++) {
        	 
          if(num%i==0) {
        	  
        	 temp++; 
          }}
        	 if(temp==2) {
        		 System.out.println("it is a prime no");
        	 
        	  
        	  
        	  
          }
        	 else {System.out.println("it is not a prime no");}
        	 
         
}
}

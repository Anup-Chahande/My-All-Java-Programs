package super20practice;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	int temp=1;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no");  
	int num = sc.nextInt();
	
       for(int i=1;i<=num;i++) {
    	   
    	   temp = i*temp;
    	   

       }
       System.out.println("Factorial of givin no is " + temp);

	
}
	
	
}

package NewLogicalPractive;

import java.util.Scanner;

public class Amstrong {
public static void main(String[] args) {
	System.out.println("Enter the No");
	Scanner sc= new Scanner(System.in);
	 int num1 =sc.nextInt();
	 int copy=num1;
	 int sum=0;
	 int rem=0;
	 while(num1!=0) {
		 rem=num1%10;
		 sum=(rem*rem*rem)+sum;
		 num1=num1/10;
		 
		 
		 
	 }
	 if(sum==copy) {
		System.out.println(sum + " is amstrong no"); 
		 
	 }
	 else {
			System.out.println(sum + " is not amstrong   no"); 
	 }
	 
	 
	 
}
	
}

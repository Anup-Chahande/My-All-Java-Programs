package NewLogicalPractive;

import java.util.Scanner;

public class Palidrome {
public static void main(String[] args) {
	
	System.out.println("Enter the No");
	Scanner sc= new Scanner(System.in);
	 int num1 =sc.nextInt();
	 int copy=num1;
	 int rem=0;
	 int sum=0;
	 while(num1!=0) {
		 rem =num1%10;
		 sum=(sum*10)+rem;
		 num1=num1/10;
		 
		 
	 }
	 if(sum==copy) {
		 
		 System.out.println(sum + " Num is palidrome ");
	 }
	 else {
		 System.out.println(sum + " Num is  not palidrome ");
	 }
	 
	 
	
	

}
}

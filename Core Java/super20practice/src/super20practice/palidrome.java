package super20practice;
import java.util.Scanner;
public class palidrome {
public static void main(String[] args) {
	System.out.println("Enter the no");
	int rem=0;
	int s =0;
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int copy=num;
	while(num>0) {
		
		rem=num%10;
		s=(s*10)+rem;
		num=num/10;

		
	}

	if(copy==s) {
		
		System.out.println("The no is palidrime no");
		
	}
	else {System.out.println("it is not palidrome no");}
	
}
}

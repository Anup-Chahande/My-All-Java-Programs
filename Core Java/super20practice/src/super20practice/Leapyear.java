package super20practice;
import java.util.Scanner;
public class Leapyear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no");
	int num = sc.nextInt();
	if(num%4==0 ) {
		System.out.println("it is leap year");
		
	}
	else {System.out.println("it is not leap year");}


	
	
}
}

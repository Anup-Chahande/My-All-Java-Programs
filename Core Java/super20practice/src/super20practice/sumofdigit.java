package super20practice;
import java.util.Scanner;
public class sumofdigit {
	
	public static void main(String[] args) {
		int r = 0;
		int sum =0;
		Scanner sc = new Scanner(System.in);
	int num =	sc.nextInt();
	
	while(num>0) {
		
		r= num%10;
		sum = r+sum;
		num = num/10;
		
		
	}
	System.out.println(sum);
	
		
	}
}

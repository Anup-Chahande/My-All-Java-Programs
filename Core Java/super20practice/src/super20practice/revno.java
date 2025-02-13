package super20practice;
import java.util.Scanner;
public class revno {
public static void main(String[] args) {
	int r;
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	while(num>0) {
		
	 r = num%10;
	 System.out.print(r);
	 num = num/10;
	 
		
	}
	
}
	
}

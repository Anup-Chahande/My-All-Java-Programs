package super20practice;
import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int c=num;
	    int r=0;
	    int v=0;
	    while(num>0) {
	    	r=num%10;
	    	v=(r*r*r) + v;
	    	num=num/10;
	    	
	    	
	    }
	    if(v==c) {
	    	
	    	System.out.println("It is an amstrong no");
	    }
	    else {System.out.println("It is not amstrong no");}
	
	}

}

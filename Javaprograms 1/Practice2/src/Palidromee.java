import java.util.Scanner;
public class Palidromee {
	
	public static void main(String[] args) {
		int rem =0 ;
		int ans = 0;
		System.out.println("enter the no");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy=num;
	       while(num>0) {
	    	   rem =num%10;
	    	ans = (ans*10) +rem;   
	    	   num =num/10;
	    	   
	       }
	       if(copy == ans) {
	    	   System.out.println("its a palidrome no");
	       }
	       else {System.out.println("it is not a palidrome no");}

	}

}

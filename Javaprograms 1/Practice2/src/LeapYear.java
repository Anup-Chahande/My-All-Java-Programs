import java.util.Scanner;
public class LeapYear {
    int a;
	void leapy(){
    	Scanner year = new Scanner(System.in);
    	System.out.println("Enter The Leep Year");
    	a= year.nextInt();
    	if(a%4==0 ) {
    		
    			if(a%400==0 || a%100!=0) {
    				System.out.println(a + " is a Leep year");
    			}
    			
    			else {
    				System.out.println(a + " is not a Leep year" );	
    		}
    			
    		
    	}
    	else {
			System.out.println(a + " is not a Leep year" );	
	}
    		
    	
    }
	
	public static void main(String[] args) {
		LeapYear y = new LeapYear();
		y.leapy();
	
	
}
}

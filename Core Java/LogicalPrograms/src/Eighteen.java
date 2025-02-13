import java.util.Scanner;
public class Eighteen {
       void m1() {
	
    	   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int num = sc.nextInt();	
    int count = 0;
    
    for(int i = 1 ;i<=num;i++) {
    	 if(num%i==0) {
    	    	count++;
    	    	
    	    	
    	    	
    	 }
    }
    	 if(count==2) {
    		 
	        	System.out.println(num + " is  a Prime number");

    	 }
    	 else {
    		 System.out.println(num + " is  a not Prime number");
    	 }
    	
    
    
       }
	
	
	
	public static void main(String[] args) {
		Eighteen s = new Eighteen();
				s.m1();
}
}

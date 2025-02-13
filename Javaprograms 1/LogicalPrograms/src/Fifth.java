import java.util.Scanner;
public class Fifth {
    void m1() {
    	Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
    	int a= sc.nextInt();
        if(a>=0) {
        	
        	System.out.println("number is Positive");
        }   	
        else {
        	System.out.println("Number is Negative");
        }
    }
    public static void main(String[] args) {
    	Fifth f = new Fifth();
    	f.m1();
    	
	}

}

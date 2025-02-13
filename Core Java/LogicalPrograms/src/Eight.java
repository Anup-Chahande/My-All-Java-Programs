import java.util.Scanner;

public class Eight {
	void m1() {
    	Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
    	int a= sc.nextInt();
        if(a>0) {
        	
        	System.out.println("number is Positive");
        }   	
        else if (a<0){
        	System.out.println("Number is Negative");
        }
        else {
        	System.out.println("Number is 0");
        }
    }
    public static void main(String[] args) {
    	Eight f = new Eight();
    	f.m1();
    	
}}

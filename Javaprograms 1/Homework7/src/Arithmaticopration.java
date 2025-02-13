import java.util.Scanner;
import java.math.*;
public class Arithmaticopration {
int a;
int b;
int c;


  void add (){
	Scanner S = new Scanner(System.in);
	System.out.println("enter the first number");
	a = S.nextInt();
	System.out.println("enter the Second number");
    b = S.nextInt();
    c= a+b;
    System.out.println("The addition of number is " + c);
  }
  void sub () {
		Scanner S = new Scanner(System.in);
		System.out.println("enter the first number");
		a = S.nextInt();
		System.out.println("enter the Second number");
		b = S.nextInt();
	    c= a-b;
	    System.out.println("The Substraction of number is " + c);
  }
	    void mul () {
	 
	    	Scanner S = new Scanner(System.in);
			System.out.println("enter the first number");
			a = S.nextInt();
			System.out.println("enter the Second number");
			b = S.nextInt();
		    c= a*b;
		    System.out.println("The multiplication of number is " + c);
	 
 }
	  
	   void div () {
		   
		   Scanner S = new Scanner(System.in);
			System.out.println("enter the first number");
			a = S.nextInt();
			System.out.println("enter the Second number");
			b = S.nextInt();
		    c= a/b;
		    System.out.println("The Division of number is " + c);
	 
		   
	   }
	   
	    void rectangle() {
	   Scanner S = new Scanner(System.in);
		System.out.println("enter the Length ");
		a = S.nextInt();
		System.out.println("enter the Breadth ");
		b = S.nextInt();
	    c= a*b;
	    System.out.println("The Area of Reactangle is " + c);

    	   
       }
	   
	    void Square () {
	    	
	    	Scanner S = new Scanner(System.in);
			System.out.println("enter the Side1 ");
			a = S.nextInt();
			System.out.println("enter the Side2 ");
			b = S.nextInt();
		    c= a*b;
		    System.out.println("The Area of Square is " + c);  	
	    	
	    }
        void Parallelogram() {
        	
        	Scanner S = new Scanner(System.in);
			System.out.println("enter the base ");
			a = S.nextInt();
			System.out.println("enter the heaight ");
			b = S.nextInt();
		    c= a*b;
		    System.out.println("The Area of Parallelogram is " + c);  	
	    	
        	
        }
	     void modular() {
	    	 
	    	 Scanner S = new Scanner(System.in);
				System.out.println("enter the 1st number ");
				a = S.nextInt();
				System.out.println("enter the 2nd number ");
				b = S.nextInt();
			    c= a%b;
			    System.out.println("The reminder is " + c);  	
		    	
	    	 
	    	 
	     }
	      void circle () {
	    	  
	    	  Scanner S = new Scanner(System.in);
				System.out.println("enter the r1  ");
				a = S.nextInt();
				System.out.println("enter the r2 number ");
				b = S.nextInt();
			    c= a*b;
			    double area =  3.14 * c;
			    System.out.println("The area of circle is " + area);  	
		    	
	    	  
	      }
	    
  public static void main(String[] args) {
	

  Arithmaticopration a1 = new Arithmaticopration();
        a1.add(); 
        a1.sub();
        a1.mul();
        a1.rectangle();
        a1.Square();
        a1.Parallelogram();
        a1.modular();
        a1.div();
        a1.circle();
  
  
  } 
  }

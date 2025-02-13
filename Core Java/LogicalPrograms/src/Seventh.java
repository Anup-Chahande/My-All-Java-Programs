
public class Seventh {

	int a = 5;
	int b= 75;
    int c = 9;
    
    
    
    
    void m1() {
    	 if(a>b && a>c) {
    		 
    		 
    		 System.out.println(a + " a is Maximum Number");
    	 }
    	 else if(b>a && b>c) {
    		 
    		 
    		 System.out.println(b + " b is Maximum Number");
    	 }
    	 else if(c>a && c>b || c>a) {
    		 
    		 
    		 System.out.println(c + " c is Maximum Number");
    	 }

    	 


     
    	
    }

public static void main(String[] args) {
	Seventh s = new Seventh();
	s.m1();
}
}

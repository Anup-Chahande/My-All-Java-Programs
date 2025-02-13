package Ifelse;

public class Sumtwo {
	void twonumbers(int no1,int no2) {
	       if(no1%2+no2%2==0) {int addition = no1+no2;
	    	   System.out.println("addition of two even no is " + addition);
	    	   
	       }
	    	    
	    	   else {System.out.println("one of them is not even");
	    	   
	       }


	}
	      
	      
	      
	      public static void main(String[] args) {
	    	  Sumtwo s1 = new Sumtwo();
	    	  s1.twonumbers(4,10);
	    	  
}
}
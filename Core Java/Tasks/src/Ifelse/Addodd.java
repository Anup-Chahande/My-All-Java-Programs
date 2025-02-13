package Ifelse;

public class Addodd {
	void twonumbers(int no1,int no2) {
	       if(no1%2!= 0 && no2%2!=0) {int addition = no1+no2;
	    	   System.out.println("addition of two odd no is " + addition);
	    	   
	       }
	    	    
	    	   else {System.out.println("one of them is even or both are even number");
	    	   
	       }


	}
	      
	      
	      
	      public static void main(String[] args) {
	    	  Addodd a1 = new Addodd();
	    	  a1.twonumbers(11,5);
	    	  a1.twonumbers(3,8);

}
}

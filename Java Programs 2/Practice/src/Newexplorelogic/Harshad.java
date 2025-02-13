package Newexplorelogic;

public class Harshad {
  public static void main(String[] args) {
	int num=15;
	int rem=0;
	int sum=0;
	int copy=num;
	
	while(copy!=0) {
		rem=copy%10;
		sum=rem+sum;
		copy=copy/10;
		
		
	}
	
       if(num%sum==0) {
    	   System.out.println(num + " it is Harshad no");
    	   
    	   
       }
       else {
    	   System.out.println(num + " it is not Harshad no");

       }
	
	
	
}
}

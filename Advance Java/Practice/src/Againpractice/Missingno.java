package Againpractice;

public class Missingno {
public static void main(String[] args) {
	

	int arr[]= {1,2,3,4,5,6,8,9};
      int n=arr.length+1;
      int Totalsum=n*(n+1)/2;
      int sum=0;
      for(int i=0;i<arr.length;i++) {
    	  
    	  sum=sum+arr[i];
    	  
    	  
      }
       int num = Totalsum-sum;
       System.out.println("Missing no is " + num);
   
}
	
}

package Newexplorelogic;

public class Frequencyofdigit {
public static void main(String[] args) {
	
	int num=123124;
   
	int arr[]=new int[10]; //The size of the array int[] frequency = new int[10]; is set to 10 because we are dealing with decimal digits (0 through 9).


	
	while(num!=0) {
		
		int rem=num%10;
		arr[rem]++;
		num=num/10;
		
		
		
		
	}
	   for(int i=0;i<10;i++) {

		   if(arr[i]>0) {
			   
			   System.out.println(i + " = " + arr[i]);

			   
		   }
 		   
	   }
	
	
	
	   
	   
	   
   
	
}
}

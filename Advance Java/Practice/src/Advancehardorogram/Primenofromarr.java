package Advancehardorogram;

public class Primenofromarr {
public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int count[]=new int [arr.length];
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=1;j<=arr.length;j++) {
			
			if(arr[i]%j==0) {
				
				count[i]++;
			}
			
		}
		
		if(count[i]==2) {
			
			System.out.println(arr[i] + " is a prime no");
			
		}
		
		
		
		
	}
	
	
	
	
	
}
}

package Againpractice;

public class Largestandsecondlargest {
public static void main(String[] args) {
	
	int arr[]= {1,23,4,53,64,254,75};
	
	 int max=arr[0];
	 int secondmax=0;
	 for(int i=0;i<arr.length;i++) {
		 
		 if(max<arr[i]) {
			 secondmax=max;
			 max=arr[i];
		 }
		 else if(max>arr[i]) {
			 
			 secondmax=arr[i];
			 
		 }
		 
		 
		 
		 
	 }
	System.out.println("Max Is "  + max);
	System.out.println("SecondMax Is "  + secondmax);

	
	
	
}
}

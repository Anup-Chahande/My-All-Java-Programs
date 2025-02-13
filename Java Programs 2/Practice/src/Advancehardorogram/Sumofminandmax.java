package Advancehardorogram;

public class Sumofminandmax {
 
public static void main(String[] args) {
	
	int arr[]= {12, 1234, 45, 67, 1};
	int min=arr[0];
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
			
			
		}
		else if(max<arr[i]) {
			
			max =arr[i];
		}
		
		
		
		
		
	}
	int sum= max+min;
	System.out.println("sum of min and max is "+ sum);
	

}	
	
}

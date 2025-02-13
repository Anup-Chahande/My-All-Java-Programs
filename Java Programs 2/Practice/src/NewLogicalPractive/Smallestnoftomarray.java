package NewLogicalPractive;

public class Smallestnoftomarray {
public static void main(String[] args) {
	int arr[]= {5,4,9,6,50,0,2,-12,3,-134,29};
	int smallest = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(smallest>arr[i]) {
			smallest =arr[i];
			
		}
		
	}
	System.out.println("smallest NO from given array is " + smallest); 
} 
	
	
}

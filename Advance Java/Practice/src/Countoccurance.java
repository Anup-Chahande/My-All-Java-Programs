import java.util.Arrays;

public class Countoccurance {
public static void main(String[] args) {
	int arr[]= {1,2,2,4,5,56,7,7,1,3,2};
	Arrays.sort(arr);
	
	for(int i=0;i<arr.length;i++) {
		int count=1;
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				
			}
			else {
			}
			
			
		}
		
		System.out.println(arr[i] + " = " + count);
         i=i+count-1;		
		
	}
	
	
	
	
}
}

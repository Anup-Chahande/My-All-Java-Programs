package LogicalPrograms;

public class sortarray {
public static void main(String[] args) {
	int arr[]= {5,1,6,2,4,3};
	int temp;
	for(int i=0;i<arr.length;i++) {
		
	
		for(int j=i+1;j<arr.length;j++) {
			
			
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				
			}
			
			
			
		}
		
		
		
		
	}
	
	for(int c=0;c<arr.length;c++) {
		
		
		System.out.println(arr[c]);
	}
	
}
}

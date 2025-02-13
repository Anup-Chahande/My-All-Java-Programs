package Advancehardorogram;

public class Removedupliatearray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 4, 5 };
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					arr[j]='0';
					
					
				}
				
				
			}
		}
		
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]!='0') {
				
				System.out.println(arr[j]);
				
			}
			
			
		}		
		
		
	}

}


public class bsort {
           
	public static void main(String[] args) {
		int temp;
		int arr [] = {20,23,22,21,14,24};
		
			for(int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]>arr[j]) {
						
						temp =arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
				
			}
			
			for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
			}
	
		
		}
		
		
		
	}


package Newexplorelogic;

public class Sepratezero {
	public static void main(String[] args) {
		int temp;
		int arr [] = {20,23,22,0,0,21,0,14,-8,-1,24};
		
			for(int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++) {
					
//					if(arr[i]!=0 && arr[j]==0) { start
					
					if(arr[i]==0 && arr[j]!=0) {

						
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

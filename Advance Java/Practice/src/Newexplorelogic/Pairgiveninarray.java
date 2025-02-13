package Newexplorelogic;

public class Pairgiveninarray {
public static void main(String[] args) {
	int arr[]= {1,2,3};
	System.out.println("Enter a no");
	int num=6;
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]+arr[j]==num) {

				
				
				System.out.println("two no sum present of giv no is " + arr[i]+ "+" + arr[j]);
			
			
		}
	}
	
	
	
	
}
}}

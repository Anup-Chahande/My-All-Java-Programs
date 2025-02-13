package NemapPrograms;

import java.util.Scanner;

public class LargestAndSecondLargestarray {
public static void main(String[] args) {
	
	int arr[]= {5,6,7,4,89,89,65};
	   int max=arr[0];
	   int secondmax=arr[0];
	for(int i=0;i<arr.length;i++) {
		
		if(max<arr[i]) {
			secondmax =max;

			max =arr[i];

			
		}
		else if(arr[i] > secondmax && arr[i] != max) {
            secondmax = arr[i];   // this condition indicate if both are sameso ignore
            	
            
            
            }
            }
		
		
	
	System.out.println("Largest is = " + max);
	System.out.println("Second Largest is = " + secondmax);

	}



}

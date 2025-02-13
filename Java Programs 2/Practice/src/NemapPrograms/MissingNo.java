package NemapPrograms;

public class MissingNo {
	public static void main(String[] args) {
		int arr[] = { 1,8,2, 3, 4, 5, 7 };
		int n = arr.length + 1;
		int totalsum = n * (n + 1) / 2;
		int sum=0;
		for (int j = 0; j < arr.length; j++) {
			
			sum=sum+arr[j];
			
			
		}
		int missingno=totalsum-sum;
		
		System.out.println("Missing no is " + missingno);

	}
}

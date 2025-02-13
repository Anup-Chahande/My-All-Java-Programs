package NewLogicalPractive;

public class sumofarray {

	public static void main(String[] args) {
		int sum=0;
		int arr[] = {1,2,3,4,5,6,7,8,9,9};
		for(int i =0;i<arr.length;i++) {
		sum=arr[i]+sum;
			
		}
		
		System.out.println("sum of array is " + sum);
	}
}

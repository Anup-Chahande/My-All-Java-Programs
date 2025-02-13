package LogicalPrograms;

public class Oneto10sumeven {
	public static void main(String[] args) {
		int even=0;
		int odd=0;

		for(int i=1;i<=10;i++) {
			
			
			if(i%2==0) {
				even=i+even;
				
				
			}
			else {
				
				odd=i+odd;
			}
			
			
			
			
		}
		
		System.out.println("sum of even is " + even);
		
		System.out.println("sum of odd is " + odd);

	}

}

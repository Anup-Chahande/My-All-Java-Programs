package NemapPrograms;

public class NumberFrequency {
public static void main(String[] args) {

	int nums[] = {1,2,3,4,1,2,3,4,4};
	int count[]=new int[nums.length];
	
	
	for(int i=0;i<nums.length;i++) {
		count[i]=1;
		for(int j=i+1;j<nums.length;j++) {
			
			if(nums[i]==nums[j]) {
				count[i]++;
				nums[j]='x';
				
				
				
				
			}
			
			
			
		}
		
	}
	
	for(int k=0;k<nums.length;k++) {
		if(nums[k]!='x'&&  nums[k]!=' ' )
		System.out.println(nums[k]+  "=" + count[k]);
		
	}
	
}
}

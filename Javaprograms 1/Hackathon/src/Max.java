
public class Max {

	
	int m1() {
		
		int max;
		int a [] = {4,2,3,1,5};
		
		max = a[4];
		
		for(int i = 0;i<a.length;i++) {
			
			if(a[i]<max) {
	
				max = a[i];
				
	}

		}
	
		return max;

	}

public static void main(String[] args) {
	Max m = new Max();
System.out.println(	m.m1());

}
}
	
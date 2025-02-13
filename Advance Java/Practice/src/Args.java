
public class Args {
 
	void m1(int a,int...b  ) {
		

		for (int i : b) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		Args a = new Args();
		a.m1(1, 4,2,3,4,5,6,7);

	}	
}

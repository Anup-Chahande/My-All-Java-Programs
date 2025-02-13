
public class Copyy {
	
	public static void main(String[] args) {
		
	
	int a[] = {1,2,3,4};
	int b[] = new int[a.length];
	for(int i=0;i<a.length;i++) {
		
		b[i] = a[i];
	}
	System.out.println("contents of b");
	for(int c = 0;c<a.length;c++) {
		System.out.println(b[c]);
		
	}

}
}
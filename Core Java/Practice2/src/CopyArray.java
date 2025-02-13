
public class CopyArray {
    
	
	
	public static void main(String[] args) {
		int a[] = {1,2,4,6,7,8};
		int b[]= new int [a.length];
		
		for(int i =0;i<a.length;i++) {
			b[i]=a[i];
			
			
			
		}
		System.out.println("values of a");
		for(int i =0;i<a.length;i++) {
          System.out.print( a[i] + " ");
			
		}
		System.out.println();
		System.out.println("values of b");
		
		for(int i =0;i<a.length;i++) {
	          System.out.print( b[i] + " ");
				
			}
		
		
	}
	
	
}

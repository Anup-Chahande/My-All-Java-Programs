import java.util.Iterator;

public class LargeArray {
	int a[] = {0,1,2,3,4,5,-9,6,7,4};
	 int temp = a[0];
	
	void length() {
		for(int i = 0; i<a.length;i++) {
            if(a[i]<temp) {
            	temp = a[i];
            }			
		}
		System.out.println(temp);
	
	}
	
	
public static void main(String[] args) {
	LargeArray ar = new LargeArray();
	ar.length();
	
}


}
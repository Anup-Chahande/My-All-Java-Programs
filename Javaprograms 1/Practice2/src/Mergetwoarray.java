
public class Mergetwoarray {
public static void main(String[] args) {
	int a[] = {1,2,3};
	int b[] = {4,5,6};
        int c[] = {a.length+b.length};
        
        for(int i = 0;i<a.length;i++) {
        	
        	
        c[i] =a[i];
        }
	for(int o = 0;o<b.length;o++) {
		
		c[o+a.length] = b[o];

	}
	System.out.println(c[0]);
}
}

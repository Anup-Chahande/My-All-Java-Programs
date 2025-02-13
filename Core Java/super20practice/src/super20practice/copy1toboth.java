package super20practice;

public class copy1toboth {
public static void main(String[] args) {
	char a[]= {1,2,3,4,5,6,34};
        int b [] =  new int[a.length];
        
        for(int i = 0 ;i<a.length;i++) {
        	
        	b[i]=a[i];
        	
        }

        for(int j = 0 ;j<b.length;j++) {
        	
        	System.out.println(b[j]);
        }
	
}
}

import java.util.Scanner;
public class Duckno {
public static void main(String[] args) {
	
	
	 Scanner sc = new Scanner(System.in);
	String c = sc.next();
         char a[] = c.toCharArray();
for (int i = 0;i<a.length;i++) {
         if(a[i]=='0' && a[0]!='0') {
        	 System.out.println("given no is duck no");
        	 
         }
        
         
}

 if (a[0] == '0'){
	 System.out.println("it is not duck no");
}
 
 
}
}
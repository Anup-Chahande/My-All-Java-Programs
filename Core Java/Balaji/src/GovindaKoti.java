import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class GovindaKoti {
	
	
	void m1() {
		String god = "Govinda" ;
		char ch[] = god.toCharArray();

		try {FileOutputStream fs = new FileOutputStream("D://Govinda Koti.txt");
               
            	   for(int a=1;a<=10000000;a++) {
            		   for(int s=1;s<=2;s++) {
            	              System.out.print(" ");
            	            	   
            		   
            		   for(int i=0;i<ch.length;i++) {
            	   fs.write(ch[i]);
            	   if(i==6) {
            		   System.out.print("  ");
            	   }
            		   }}

            	   }
               

       
       
       }
       catch(Exception s) {
    	   System.out.println("sorry balaji");
       }


}
	public static void main(String[] args) {
		GovindaKoti g = new GovindaKoti();
		g.m1();
	}
}
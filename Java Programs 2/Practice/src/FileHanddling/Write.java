package FileHanddling;

import java.io.FileOutputStream;

public class Write {
public static void main(String[] args) {
	try {FileOutputStream fs = new FileOutputStream("D:\\Desktop Data\\anup.tka");
	String s = "Thank you Sagar  Sir for Training Me";
	char ch[] = s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		
            fs.write(ch[i]);		
		
	}
	
	}
	catch(Exception e) {
		System.out.println("Somthing Wrong");
		
	}
}	

}
	

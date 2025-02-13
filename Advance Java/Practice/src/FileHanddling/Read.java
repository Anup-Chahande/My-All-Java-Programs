package FileHanddling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read {
public static void main(String[] args) {
	try {
		FileInputStream fs = new FileInputStream("D:\\Desktop Data\\readme.txt");
        int i=0;   
		while(i!=-1) {
			
			 i =fs.read();
			System.out.print((char)i);

		}
		
	} catch (Exception e) {

	System.out.println("Chek The File");
	
	}
}
}

package Seralization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Storeobjinfile {
public static void main(String[] args) {
	try {

		FileInputStream fs = new FileInputStream("D:\\Objread.txt");
	     ObjectInputStream os= new ObjectInputStream(fs);
		
//		    Student s1= new Student(1,"Balaji",99999);
	     Student s1;
		   s1=(Student) os.readObject();
		    os.close();
		    fs.close();
		    System.out.println(s1);
	
}
	catch (Exception e) {}
	
}
}

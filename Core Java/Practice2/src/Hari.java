import java.io.FileInputStream;

public class Hari {
	public static void main(String[] args) {
	try {
	FileInputStream Hari = new FileInputStream("D:\\Govinda.txt");
	int i = 0;

	for (;((i =Hari.read()) != -1);) {
		System.out.print((char) i );
	}
	
	}
	catch(Exception e) {
System.out.println("I love all vishnu avtars and vishnu in any dimension and every univerce");
	
	}
	
	
	}
}

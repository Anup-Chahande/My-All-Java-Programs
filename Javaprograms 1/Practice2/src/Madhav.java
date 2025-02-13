import java.io.FileOutputStream;
public class Madhav {
public static void main(String[] args) {
	String s= "I Love You My  Krishna";
	byte b [] = s.getBytes();

	try {
	FileOutputStream sf = new FileOutputStream("D:\\Krishna.txt");
for(int i = 0;i<b.length;i++) {
           sf.write(b[i]);
	
	
}
//           sf.write(b); also work

	
	}
	catch(Exception e){
		System.out.println("File not found");
	}
}
	
	
}

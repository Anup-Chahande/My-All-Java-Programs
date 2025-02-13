import java.io.FileOutputStream;
public class God {
public static void main(String[] args) {
	
	
	try {
	FileOutputStream f = new FileOutputStream("D:\\HariShivBrammha.god");
	String s = "Hari Shiv Brammha";
	char God[]= s.toCharArray();
	for(int i=0;i<God.length;i++) {
		f.write(God[i]);
	}
	
	}
	catch(Exception e){
		System.out.println("I love u all gods and their forms");
		
	}
}
}

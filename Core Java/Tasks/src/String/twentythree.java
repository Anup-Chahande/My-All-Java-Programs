package String;

public class twentythree {
public static void main(String[] args) {
	String v = "education";
	char c []= v.toCharArray(); 
	for(int i = 0;i<c.length;i++) {
		if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' ) {
		System.out.println("in Given String this vovels are present = " + c[i]);
		}
	}	

	}
	
}

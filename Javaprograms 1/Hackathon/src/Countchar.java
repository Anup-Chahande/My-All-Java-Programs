import java.util.Scanner;

public class Countchar {
public static void main(String[] args) {
	int c = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a any String");
	String str = sc.next();
	char[] a = str.toCharArray();
	for(int i = 0;i<str.length();i++) {
		c++;
		
	}
	System.out.println(c);

	
}
}

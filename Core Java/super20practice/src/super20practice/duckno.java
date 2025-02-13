package super20practice;
import java.util.Scanner;
public class duckno {
public static void main(String[] args) {
	System.out.println("Enter the no");
	Scanner sc = new Scanner(System.in);
String num = sc.next();
char ch[] = num.toCharArray();
for(int i = 0;i<ch.length;i++) {
	
	if(ch[0]!='0') {
		if(ch[i]=='0') {
			
			
			System.out.println("it is duck no");
			break;
			
		}
		
		

		
		
		
		
	}
	else {System.out.println("it is not duck no");
	break;
	}
	
	if(ch[i]!=0) {
		System.out.println("it is not duck no");
		
	}
          
	
	
	
}}
	
}


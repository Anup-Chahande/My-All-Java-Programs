package Que1;
import java.util.Scanner;
public class Vovel_and_consonent {
public static void main(String[] args) {
	System.out.println("Enter the string");
	Scanner sc = new Scanner(System.in);
	 String string = sc.next();
	
	 char ch [] = string.toLowerCase().toCharArray();
	 
	 for(int i = 0 ;i<ch.length;i++) {
		 
		 if(ch[i] == 'a'|| ch[i] == 'e' ||  ch[i] == 'i' ||  ch[i] == 'o' || ch[i] == 'u' ) {
			 
			 System.err.println("Vovel from given string is " + ch[i]);
			 
			 
		 }
		 
          
		 else {System.out.println("The consonant from given string are " + ch[i]);}
		 
	 }
	
	
	
}
	
	
	
}

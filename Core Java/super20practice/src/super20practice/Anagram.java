package super20practice;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first string");
	String one = sc.next();
	System.out.println("Enter the second string ");

	String two = sc.next();

       char ch1[] =  one.toLowerCase().toCharArray();
       char ch2[] =  two.toLowerCase().toCharArray();

          Arrays.sort(ch1);
          Arrays.sort(ch2);
          
          if(Arrays.equals(ch1,ch2)) {
        	  System.out.println("both string is anagram");
        	  
        	  
          }
          else {System.out.println("both string is not anagram");}

       
	
	}
	

}
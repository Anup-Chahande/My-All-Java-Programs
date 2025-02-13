import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	

	String one = "Listen";
	String two = "Silent";
	
	char ch1 [] = one.toLowerCase().toCharArray();
	char ch2 [] = two.toLowerCase().toCharArray();
 
	Arrays.sort(ch1);
	Arrays.sort(ch2);
 if( Arrays.equals(ch1, ch2)){
	 
	 
	 System.out.println("it is anagram string");
	 
	 
	 
 }
 else {System.out.println("it is not anagram");}
	
	
}
}
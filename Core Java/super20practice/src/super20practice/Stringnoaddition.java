package super20practice;

public class Stringnoaddition {
public static void main(String[] args) {
	int sum = 0;
	String str = "abc2s4asd3";
	char ch [] = str.toCharArray();
	
	for (char c : ch) {
		
		if(Character.isDigit(c)) {
			
		sum = sum +	Integer.parseInt(String.valueOf(c));
			
			
		}
		
	}
	System.out.println(sum);
}
	
	
}

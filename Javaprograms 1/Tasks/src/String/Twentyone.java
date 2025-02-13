package String;

public class Twentyone {
public static void main(String[] args) {
	
	String Ch = "12345";
	char b [] = Ch.toCharArray();
for (int c=0;c<=b.length-1;c++) {
	
	int numbers = Character.getNumericValue(b[c]);
	System.out.println("All charecters now converted into numbers " + numbers);

	
	}

}
}

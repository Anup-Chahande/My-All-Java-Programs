package String;

public class Twentyfive {
public static void main(String[] args) {
	int c = 0;
	String s = "Java4By2Ki7ran";
	 char a[] = s.toCharArray();
	 for(int i = 0;i<a.length;i++) {
		 if(Character.isDigit(a[i])) {
			int add = Character.getNumericValue(a[i]); 
			 c=c+add;
		 }
		 
	 }
	 System.out.println("addition of Striing no is " + c);
}
}

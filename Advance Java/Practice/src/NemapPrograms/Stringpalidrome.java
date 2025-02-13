package NemapPrograms;

public class Stringpalidrome {
	public static void main(String[] args) {
	
		String str="sraddar";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
                rev = rev+str.charAt(i);			
			
			
		}
		
		if(rev.equals(str)) {
			
			System.out.println(str + "= is palidrome string");
		}
		else {
			System.out.println(str + "= is not palidrome string");

			
		}
		
		
		
		
	}
}

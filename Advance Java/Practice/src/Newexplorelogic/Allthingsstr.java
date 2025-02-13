package Newexplorelogic;

public class Allthingsstr {
	public static void main(String[] args) {
//percentage of uppercase, lowercase, digits and special characters in a string
		String str = "hi123csafAdf*&^";
		int uppercase = 0;
		int lowercase = 0;
		int digits = 0;
		int specialch = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				uppercase++;
				
				
			}
			else if(Character.isLowerCase(ch)) {
				lowercase++;
				
			}
			
			else if(Character.isDigit(ch)) {
				digits++;
				
			}
			else {
				specialch++;
			}

		}
		
		
		System.out.println("total upeercase = " + uppercase);
		System.out.println("total lowercase = " + lowercase);
		System.out.println("total digits = " + digits);
		System.out.println("total specialchar = " + specialch);


	}
}

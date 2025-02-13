package Newexplorelogic;

public class Reverseeachwordinstring {

	public static void main(String[] args) {
		
		String str ="this is word";
		str=str+"";
		String rev="";
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);

			if(c!=' ') {
				
				rev =c+rev;

			}
			else {

				rev=rev+' ';
		}

		
		
	}
		System.out.println(rev);

	}}

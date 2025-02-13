package NemapPrograms;

public class LognestString {
	public static void main(String[] args) {
		String str = "Find the Largest";
		str = str + " ";
		String word = "";
		String Large = "";

		for (int i = 0; i < str.length(); i++) {
			
			char ch=str.charAt(i);
			if(ch!=' ') {
				
				word =word+ch;
				
			}
			else {
				
				if(word.length()>Large.length()) {
					Large=word;
				
			}
				word="";
	
			}
			
			
			
		}
		System.out.println(Large);

	}

}

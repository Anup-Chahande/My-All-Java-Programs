
public class Vovels {
	
	
	public static void main(String[] args) {
		String str = "abcde";
		
		
		
		
		char ch [] = str.toCharArray();
		
		
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				
				ch[i]=' ';
                  				
				
				
				
			}
			
			
			
			
			
		}
		
		for(int j=0;j<str.length();j++){
			
			System.out.print(ch[j]);
			
		}
		
		
		
		
		
		
		
		
	}
	
}


public class Duplicateelement {
	
	
	public static void main(String[] args) {
		
		String st = "acbcdefe";

		
		
		
		
		char ch [] = st.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			
			for(int c = 1+i;c<ch.length;c++) {
				
				
				if(ch[i]==ch[c]) {
					
					System.out.println(ch[c]);
					
					
					
				}
				
				
				
				
				
			}
			
			
			
			
			
			
			
		}
		
		
		
	}
	
	

}

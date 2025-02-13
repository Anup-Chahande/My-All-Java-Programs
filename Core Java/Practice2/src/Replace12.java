
public class Replace12 {
  void m1() { 
	  
	  String value = "anup";
	char c []=   value.toCharArray();
	  for(int i = 0;i<c.length;i++) {
		  
		  if(c[i]== 'a' || c[i] == 'e' || c[i]=='i' || c[i]=='o' || c[i]=='u' ) {
			  
			c[i]= '#';
			  
			  
		  }
		  
		  
	  }
	  
	  System.out.println(c);

	  
  }
	public static void main(String[] args) {
		Replace12 ls = new Replace12();
		ls.m1();
	}
	
}

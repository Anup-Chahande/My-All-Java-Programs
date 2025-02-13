import java.util.Scanner;

public class Replace12withsc {


  void m1() { 
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the name");
	  String value = sc.next();
	char c []=   value.toCharArray();
	  for(int i = 0;i<c.length;i++) {
		  
		  if(c[i]== 'a' || c[i] == 'e' || c[i]=='i' || c[i]=='o' || c[i]=='u' ) {
			  
			c[i]= '#';
			  
			  
		  }
		  
		  
	  }
	  
	  System.out.println(c);

	  
  }
	public static void main(String[] args) {
		Replace12withsc ls = new Replace12withsc();
		ls.m1();
	}
	
}



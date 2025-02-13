package Ifelse;

public class Even {
	void evenNo(int no) {
		if(no%2==0 ) {
			System.out.println(no + " is even number");
			
		}
		
		else {
			System.out.println(no + " no is not even no");
		}
		
		
		
	}
public static void main(String[] args) {
	Even i = new Even();
	i.evenNo(5);
	
}
}

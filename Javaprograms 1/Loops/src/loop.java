
public class loop {
 int a = 10;
 
	
	void lpp() {
	for( ; ;) {
		int c = ++a;
		System.out.println(c);

	}

	}

	public static void main(String [] args) {
		
		loop l = new loop();
		l.lpp();
	}
	
	
}
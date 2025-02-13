
public class Sttatic {

	 static int c = 10000;
	
	void buy(int a) {
		
		  c = c-a;
		
		System.out.println("remaining balance is " +c);
	
	
	}
	

public static void main(String[] args) {
	Sttatic s = new Sttatic();
     s.buy(5000);
 	Sttatic s2 = new Sttatic();
    s2.buy(2000);

}
}

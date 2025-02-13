
public class metgod {
int  add() {
	
	int c = 7+7;
	
	System.out.println(c);
	return c;

}

public static void main(String[] args) {
	metgod  m = new metgod();
	int b = m.add();
if(b==14) {
	System.out.println("Pass");
}	
}
}

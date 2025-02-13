package DoWhileLoop;

public class Eighteen {
public static void main(String[] args) {
	int a=1;
	do {
		
		if(a%2==0) {
			System.out.print(a + " ");
		}
		else {System.out.print(a + "- ");}
		a++;
	}
	while(a<=10);
}
}

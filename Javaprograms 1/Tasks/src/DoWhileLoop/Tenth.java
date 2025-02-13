package DoWhileLoop;

public class Tenth {
public static void main(String[] args) {
	int a=1;
	do {
		if(a%2==0) {System.out.println(a + " is even");}
		else {System.out.println(a + "  is odd");}
		
		a++;
		}
	while(a<=100);
}
}

package WhileLoop;

public class Twentythree {
public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.print(a + " "+b+" ");

	while(a<=8) { 
		
		int c=a+b;
		System.out.print(c + " ");
		a=b;
		b=c;
		
		a++;
	}
	
}
}

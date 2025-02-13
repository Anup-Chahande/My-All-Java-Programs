import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	
	//011235
	
	int a = 0;
	int b=1;
	int c;
	Scanner sc = new Scanner(System.in);
	int value = sc.nextInt();
	for(int i = 0;i<=value;i++) {
		System.out.print(a + " ");
		c = a+b;
		a=b;
		b=c;
		
		
	}
	
	
	
	
}
}

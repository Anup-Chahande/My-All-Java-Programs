import java.util.Scanner;

public class Fibonlaci {
	
	//011235
public static void main(String[] args) {
	System.out.println("Enter the range");
	Scanner sc = new Scanner(System.in);
	int range=sc.nextInt();
	int a=0;
	int b=1;
	int c=0;
	for(int i=0;i<=range;i++) {
		System.out.print(a+ " ");
		c=a+b;
		a=b;
		b=c;
		
		
	}
}
}

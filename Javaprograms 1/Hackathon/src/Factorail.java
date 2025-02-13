import java.util.Scanner;
public class Factorail {
	public static void main(String[] args) {
		int b=1;
		
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int a=1;a<=num;a++) {
			
		b = b * a;

			
		}
		
		System.out.println(b);

		
	}

}

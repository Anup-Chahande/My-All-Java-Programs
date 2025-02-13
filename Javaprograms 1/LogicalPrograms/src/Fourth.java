import java.util.Scanner;
public class Fourth {

	void m1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println(a + " is even");
			
		}
		else {System.out.println( a+ " Is odd");}
	}
	
	public static void main(String[] args) {
		Fourth f = new Fourth();
		f.m1();
	}
}

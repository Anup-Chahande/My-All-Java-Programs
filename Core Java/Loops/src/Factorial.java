import java.util.Scanner;

public class Factorial
{
 void factors() {
	 System.out.println();
	 Scanner sc= new Scanner(System.in);
	int a=  sc.nextInt();
	int facto1rial=1;
	for(int i = 1;i<=a;i++) {
		facto1rial = facto1rial* i;
	}
 System.out.println(facto1rial);
 }
 public static void main(String[] args) {
	 Factorial s = new Factorial();
	 s.factors();
}
 
}

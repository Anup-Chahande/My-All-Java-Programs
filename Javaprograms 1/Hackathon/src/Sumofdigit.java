import java.util.Scanner;
//123
public class Sumofdigit {
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter the no");
	int a = sc.nextInt();
	int c=0;
	while(a>0) {
		int temp = a%10;
		
		a=a/10;
		 c=temp +c;
	}
System.out.println(c);	
}

}

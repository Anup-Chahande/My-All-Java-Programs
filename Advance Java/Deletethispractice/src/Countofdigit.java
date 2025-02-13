import java.util.Scanner;

public class Countofdigit {
public static void main(String[] args) {
	System.out.println("Enter the no");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
      int rem=0;
	int count=0;
	while(num!=0) {
		rem=num%10;
		count++;
		num=num/10;
	}
	System.out.println("Count of digit = " + count);
	
}
}

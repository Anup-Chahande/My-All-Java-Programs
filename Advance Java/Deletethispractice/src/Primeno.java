import java.util.Scanner;

public class Primeno {
public static void main(String[] args) {
	
	System.out.println("Enter the no");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("it is a prime no");
	}
	else {
		System.out.println("it is not a prime no");

	}
	
}
}

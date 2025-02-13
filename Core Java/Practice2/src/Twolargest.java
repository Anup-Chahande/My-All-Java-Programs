import java.util.Scanner;
public class Twolargest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first no");
	int a =sc.nextInt();
	System.out.println("Enter the Second no");
	int b = sc.nextInt();
	System.out.println("Enter the third no");
	int c = sc.nextInt();
	if(a>b && a>c) {
		System.out.println(a +  " a is largest");
	}
	else if(b>a && b>c) {
		System.out.println(b + " b is largest");
	}
	else if(c>a && c>b) {
		System.out.println(c +  " c is largest");
	}
	else {System.out.println("All are equal");}
}
}

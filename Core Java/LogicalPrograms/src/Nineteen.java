import java.util.Scanner;
public class Nineteen {
public static void main(String[] args) {
int a = 0;
int b = 1;
int c;
Scanner sc = new Scanner(System.in);
System.out.println("enter the no");      
int num = sc.nextInt();
             for(int i =1;i<=num;i++) {
            	 
            	 System.out.print(a + " ");
            	 c=a+b;
            	 a=b;

            	
            	 b=c;
             }
	
	
	
}
}

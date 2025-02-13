package super20practice;
import java.util.Scanner;
public class vovelorconsonent {
public static void main(String[] args) {
	Scanner c = new Scanner(System.in);
        char ch =  c.next().charAt(0);
        if(ch == 'a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u') {
        	
        	System.out.println(ch +" = The Charecter is Vovel");
        	
        }
        else
        {
        	System.out.println(ch +" = The Charecter is Consonent");

        }
}
	
}

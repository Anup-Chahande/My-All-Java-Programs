import java.util.Arrays;
public class Lagrest {
 int arr[] = {1,2,3,4,5,6,7,8,8885};


 void findlargest() {
 
 int answer = Arrays.stream(arr).max().getAsInt();
 System.out.println(" max array is " + answer);
 
 
 }
public static void main(String[] args) {
	Lagrest l = new Lagrest();
	l.findlargest();
		
} 
}






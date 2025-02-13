import java.util.Scanner;
public class Amstrong {
public static void main(String[] args) {
	int rem,ans = 0;
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int v=num;
	while(num>0) {
	rem = num%10;
	ans = (rem*rem*rem)+ans;
	num = num/10;
	

	}
	
	if(v==ans) {
		System.out.println(ans + " no is amstorng");
			
			}
		else {System.out.println("no is not amstrong");}

}
}

import java.util.Scanner;
public class Vovels {
 char vovels;
 void Check() {
	 System.out.println("Enter The Alphabhet in '' ");
	 Scanner sc = new Scanner(System.in);
	vovels =  sc.next().charAt(1);
	 if(vovels =='a' || vovels =='e' || vovels =='i' || vovels =='o' ||vovels =='u' ) {
		 
		 System.out.println(vovels + " is Vovel");
	 }
	 else {
		 
		 
		 System.out.println( vovels + " is Consonent ");
	 }
 }
 
 public static void main(String[] args) {
	
 Vovels v = new Vovels();
  v.Check();

}}
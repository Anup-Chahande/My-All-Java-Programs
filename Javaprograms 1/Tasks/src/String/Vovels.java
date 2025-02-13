package String;

public class Vovels {

	public static void main(String[] args) {
		String a = "abcdefghijklmnopqrstuvwxyz";
		char b[]= a.toCharArray();
		System.out.println("The vovels is ");
		for(int i = 0;i<a.length();i++){
		if(i==0 || i==4 || i==8 || i==14 || i==20 ) {
			
			System.out.println( b[i]);
			System.out.println(b.length);
		}
		}
		System.out.println("Consonent is");
		
		for(int i = 0;i<a.length();i++){
	if(i!=0 && i!=4 && i!=8 && i!=14 && i!=20) {
		
		System.out.println(b[i]);
		
	}
		}}

}

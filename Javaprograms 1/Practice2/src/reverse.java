
public class reverse {
	public static void main(String[] args) {
		String str="Anup";
		String rev="";
		
		System.out.println("The original string is:"+str);	
		System.out.println();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("The reverse string is:"+rev);
	}

}

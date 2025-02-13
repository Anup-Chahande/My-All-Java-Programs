
public class Cons_return {
	
	
	public static void main(String[] args) {
		int a=9;
		    //10    -10   9      9
		int k=++a - a-- + a++ + --a;
		                  //19   19   9
		System.out.println(++k + k++ +a++);
		
	}
}

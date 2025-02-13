import java.util.Hashtable;
public class HashTAblee {
public static void main(String[] args) {
	Hashtable<Integer,String> t = new Hashtable<>();
	t.put(1, "hii");
	t.put(2, "hiii");
	t.put(3, "hiiiii");
	t.put(4, "hiiiiiii");
	t.put(5, "hiiiiiiiii");
	t.put(2, "hiiiiiiiiiiiiii");

	
	System.out.println( t.values());
	
}
}	


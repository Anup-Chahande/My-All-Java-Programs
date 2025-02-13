package LibraryManagement;
import java.util.ArrayList;
public class AccessBook extends Book{

	ArrayList<AccessBook> accessbook() {	
		AccessBook b1 = new AccessBook();
		AccessBook b2 = new AccessBook();
		AccessBook b3 = new AccessBook();
		AccessBook b4 = new AccessBook();
		AccessBook b5 = new AccessBook();

		b1.add_Item("java", 1321, "james gosline");
		b2.add_Item("corejava", 1324, "kiranacademy");
		b3.add_Item("c", 1325, "denis richi");
		b4.add_Item("cpp", 1326, "xyz");
	
		ArrayList<AccessBook> al = new ArrayList<>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		
		return al;
		



	}
	
	
	
	


	@Override
	public String toString() {
		return "AccessBook [bookname=" + bookname + ", bookid=" + bookid + ", bookauthor=" + bookauthor + "]";
	}





	public static void main(String[] args) {
		AccessBook as = new AccessBook();
		as.accessbook();
		as.search_Item();
		as.remove_Item();
	}
}

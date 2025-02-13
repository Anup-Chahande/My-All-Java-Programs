package LibraryManagement;
import java.util.ArrayList;
import java.util.Scanner;
public abstract class Book implements LibraryItems{
    String bookname;
    int bookid;
    String bookauthor;
    
	@Override
	public void add_Item(String bookname,int bookid,String bookauthor) {
		this.bookname=bookname;
		this.bookid =bookid;
	    this.bookauthor =bookauthor;
		//System.out.println("Item name = " + this.bookname + "| Item ID = " + this.bookid + "bookauthor " + this.bookauthor );	

	
	}

	
	public void search_Item() {
		Scanner sc = new Scanner(System.in);

		AccessBook as = new AccessBook();
		ArrayList<AccessBook> books = as.accessbook();
		
		for (AccessBook accessBook : books) {
		
			
			System.out.println(accessBook);
			
		
		}
	for (AccessBook accessBook : books) {
		if(accessBook.bookname=="java") {
			System.out.println(accessBook);
			
		}
		
		
	}	
	}
		
		
	
	public void remove_Item() {
		AccessBook ai = new AccessBook();

	ArrayList<AccessBook> bookss = ai.accessbook();

		
				
			}
		}



public class Lib {

	String title;
	String author;
	String isbn;
	boolean available;

	/*public Lib(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = true;
	}
*/
	public void borrowBook() {

		this.available = false;
		System.out.println("this booked available " + this.available);

	}

	public void returnBook() {
		this.available = true;

		System.out.println("this book available " + this.available);

			}

	public static void main(String[] args) {
		Lib book1 = new Lib();

		Lib book2 = new Lib();
		Lib book3 = new Lib();

		book1.borrowBook();
		book2.borrowBook();
		book1.returnBook();

		book1.returnBook();
		book3.returnBook();
		book1.returnBook();
		book1.returnBook();

		
	}
}



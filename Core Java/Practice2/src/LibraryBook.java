
public class LibraryBook {

	String title;
	String author;
	String isbn;
	boolean available;

	public LibraryBook(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = true;
	}

	public void borrowBook() {

		this.available = false;
		System.out.println("this book available " + this.available);

	}

	public void returnBook() {
		this.available = true;

		System.out.println("this book available " + this.available);

			}

	public static void main(String[] args) {
		LibraryBook book1 = new LibraryBook("java", "James gosline", "31234asd13");

		LibraryBook book2 = new LibraryBook("python", "xyz ", "312342321Ads13");
		book1.borrowBook();
		book2.borrowBook();

		book1.returnBook();
		book2.returnBook();

		
	}
}

package Oops;

public class Book extends LibraryItem{
 private String author;

public String getAuthor() {
	return author;
}

Book(){}

public Book(String author) {
	this.author = author;
}
@Override
protected void displayinfo() {
	
	System.out.println("Author name = " + author);
	
}




public static void main(String[] args) {
	Book author1= new Book(" james gosline ");
	author1.displayinfo();
	Book author2 = new Book(" james gosline 2 ");
	author2.displayinfo();
}


}


public class LibraryBook {
	
	
	String title;
	String author;
	String isbn;
	boolean available;
	
	

 LibraryBook (String title,String author,String isbn){
	this.title = title;
	 this.author = author;
	 this.isbn = isbn;
	 this.available = true;
	 
	 
 }
 
  public  void browBook (){
	  
  this.available = false;
	  
	  
  }
 


public void returnBook (){
	
 this.available= true;	

}


public static void main (String [] args) {
	LibraryBook book1 = new LibraryBook(" The Catcher in the Rye "," J.D. Salinger "," 978-0-316-76948-0 ");
	LibraryBook book2 = new LibraryBook(" Mockingbird "," Harper Lee "," 978-0-06-112008-4 ");
    book1.browBook();
    book2.browBook();
    book2.returnBook();
  

    
    System.out.println(" Book 1 is avaliable " + book1.available );
    System.out.println(" Book 2 is avaliable " + book2.available );

}

    
}



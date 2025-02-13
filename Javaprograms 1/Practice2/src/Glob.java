
public class Glob {
	

	
	String title;
	String author;
	String isbn;
	boolean available;
	
	

	Glob (String title,String author,String isbn){
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
 void book12 () {
	 
	    System.out.println(" Book 2 is avaliable " + available );

 }

public static void main (String [] args) {
	Glob book1 = new Glob(" The Catcher in the Rye "," J.D. Salinger "," 978-0-316-76948-0 ");
	Glob book2 = new Glob(" Mockingbird "," Harper Lee "," 978-0-06-112008-4 ");
    
    book2.browBook();
    book2.returnBook();
    book2.book12();
    book2.browBook();
    book2.book12();

    
    //System.out.println(" Book 1 is avaliable " + book1.available );
    System.out.println(" Book 2 is avaliable " + book2.available );

}

    
}






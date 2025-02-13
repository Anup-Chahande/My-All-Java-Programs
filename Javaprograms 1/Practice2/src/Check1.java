
public class Check1 {
	//String title;
	//String author;
	//String isbn;
	boolean available;
	
	

	/*Check1 (String title,String author,String isbn){
	this.title = title;
	 this.author = author;
	 this.isbn = isbn;
	 this.available = true;
	 
	 
	
 }
 */
  public  void browBook (){
	  
  this.available = false;
	  
	  
  }
 


public void returnBook (){
	
 this.available= true;	

}


public static void main (String [] args) {
	Check1 book1 = new Check1();
    book1.browBook();
    book1.returnBook();
    book1.browBook();

    System.out.println(" Book 1 is avaliable " + book1.available );

}

    
}



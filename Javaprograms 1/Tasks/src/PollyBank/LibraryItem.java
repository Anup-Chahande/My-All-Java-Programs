package PollyBank;

public class LibraryItem {
  String title;
  String author;
  String location;
  

      void LibraryItems(String title,String author,String location){
    	 
    	 this.title=title;
    	 
    	 this.author=author;
    	 this.location=location;
    	 
     }
    
     void displayInfo() {
    	 
    	 
    	 System.out.println("Title is : " + title + " | Author Name is " + author + " | Location is " + location);
     }
    		 
    		 
    		 
     

public static void main(String[] args) {
	
	LibraryItem book1=new LibraryItem();
	LibraryItem book2=new LibraryItem();

	
	
	book1.LibraryItems("Java","James Gosline","California");
	book1.displayInfo();
	book2.LibraryItems("Programing Pearls","Jon Bentley","USA");
	book2.displayInfo();
}



}




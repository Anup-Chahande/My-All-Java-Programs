package Oops;

public class LibraryItem {

	private String title;
	private int itemID ;

	
	
	
	
	public String gettitle() {
		
		
		
		return title;
	}
   public int getID() {
		
		
		
		return itemID;
	}

   LibraryItem(String title,int itemID) {
	   this.title=title;
	   this.itemID=itemID;
	   
   }
   LibraryItem(){}
   
   protected void displayinfo() {
	   System.out.println("Book name " + this.title);
	   System.out.println("Book ID " + this.itemID);

   }

   
   public static void main(String[] args) {
	   LibraryItem i1 = new LibraryItem("java",1321);
	   i1.displayinfo();
	  System.out.println("**************************");
	   LibraryItem i2 = new LibraryItem("java2",132451);
	   i2.displayinfo();

}

}

   



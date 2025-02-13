package PollyBank;

public class Ebook extends LibraryItem {
	String pdf;
	String filesize;

	
	void Info(String pdf,String filesize) {
		
		this.pdf=pdf;
		this.filesize=filesize;
		
		
	}
	
	void displayInfo() {
   	 System.out.println("File Format =" +pdf + "  | Filesize = "+ filesize );
   	 
   	 
    }
	public static void main(String[] args) {
		Ebook bb1=new Ebook();
		bb1.Info("This is pdf of 1st book", "20MB");
		Ebook bb2=new Ebook();
		bb2.Info("This is pdf of 2st book", "10MB");
        bb1.displayInfo();
        bb2.displayInfo();

		
	}

}

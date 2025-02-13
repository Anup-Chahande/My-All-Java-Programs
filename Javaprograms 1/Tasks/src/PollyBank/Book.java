package PollyBank;

public class Book extends LibraryItem {
String genere;
int numberOfPages;
     
void OtherInfo(String genere,int numberOfPages) {
	this.genere=genere;
	this.numberOfPages=numberOfPages;
	
}





void displayInfo() {
	 
	 
	 System.out.println("Genere is = " + genere + "Pages is = " + numberOfPages );
}
public static void main(String[] args) {
	Book b1 = new Book();
	b1.OtherInfo("Programing",500);
	b1.displayInfo();
	Book b2 = new Book();
	b2.OtherInfo("Programing",800);
	b2.displayInfo();
}

}

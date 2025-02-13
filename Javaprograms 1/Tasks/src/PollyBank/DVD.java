package PollyBank;

public class DVD extends LibraryItem{
	String Director;
	float runtime;
	
	void dvdinfo(String Director,float runtime ) {
		this.Director=Director;
		this.runtime=runtime;
			
			
	}
	void displayInfo() {
   	 
   	 
   	 System.out.println("Dvd Director =" + Director + "  |   Runtime = " + runtime);
    }
   		public static void main(String[] args) {
   			DVD DVD1=new DVD();
   			DVD DVD2=new DVD();
   			DVD1.dvdinfo("Steven", 10.10f);
   			DVD2.dvdinfo("Ben", 20.40f);
   			DVD1.displayInfo();
   			DVD2.displayInfo();
		}

}

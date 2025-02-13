package Exeption.HotelManagement;

public class FrontDesk extends Employee{
       
@Override
	void checkInGuest(String Guest) {
		this.Guest=Guest;
		System.out.println("List of Gust is : "+this.Guest);

	}


void hire() {
	
	
}
void fire() {
	
	
}
void update() {
	
	
	
}


	public static void main(String[] args) {
		FrontDesk f = new FrontDesk();
		FrontDesk guest1 = new FrontDesk() ;
		guest1.checkInGuest("Anup Chahande");
		FrontDesk guest2 = new FrontDesk() ;
		guest2.checkInGuest("Sagar Sir");
		
	}
	
}

package Exeption.HotelManagement;

public class Employee {
	 String Guest; 
	
	void checkInGuest(String Guest) {
		this.Guest=Guest;
		System.out.println("Welcome to our hotel "+this.Guest);

		
	}
	
	void cleanRoom() {
		System.out.println("Your room is cleaned mr/ms "+this.Guest);

		
		
	}
	public static void main(String[] args) {
		Employee guest1 = new Employee() ;
		guest1.checkInGuest("Anup Chahande");
		Employee guest2 = new Employee() ;
		guest2.checkInGuest("Sagar Sir");
		System.out.println("");
		guest1.cleanRoom();
		guest2.cleanRoom();
	}
}

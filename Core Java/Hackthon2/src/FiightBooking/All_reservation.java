package FiightBooking;

public class All_reservation implements Reservation{

	@Override
	public void allreservation() {
		Book_a_ticket t1 = new Book_a_ticket();
		t1.Booktickit("anup", 564654, 22,5000);
		Book_a_ticket t2 = new Book_a_ticket();
		t2.Booktickit("shankar", 2123123, 23,10000);
		if(Book_a_ticket.pay==Paymentss.normalticikit ) {
			System.out.println("Payment sucesfull normal tickit ");
			
		}
		else if(Book_a_ticket.pay==Paymentss.business) {
			System.out.println("Payment sucesfull business tickit ");

		
		}
	}
	
	
	
	public static void main(String[] args) {
		All_reservation rr = new All_reservation();
		rr.allreservation();
	}

}

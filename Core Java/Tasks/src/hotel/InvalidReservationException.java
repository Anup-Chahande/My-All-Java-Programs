package hotel;

public class InvalidReservationException extends RuntimeException{

	public String getMessage() {
		
		return "Room/hall is not Available";
	}
	
}

package hotel;

public class Reservations {
	
	String Name;
	String ID;
	String type;
	public static  double money = 5000;
	
	Reservations(){}
	Reservations(String Name, String ID, String type,double money){
		this.Name=Name;
		this.ID=ID;
		this.type=type;
		this.money =this.money-money;
		System.out.println("Your need to pay before check-in " + this.money);
		
		
		
		
	}
	
	Reservations(String Name, String ID, String type){
		this.Name=Name;
		this.ID=ID;
		this.type=type;
		
		
		
		
		
	}
	void room(){
		
               if(Name != null && ID !=null && type !=null) {
             if(type == "Delux" ) {
            	   System.out.println("Delux room is booked");
            	   
            	   
               }
             else if(type == "Standard" ) {
          	   System.out.println("Standard room is booked");
          	   
          	   
             }
             else if(type == "Suit" ) {
          	   System.out.println("Suit room is booked");
             }
          	 else {
             	  throw new InvalidReservationException();
              }
             
             
            
               }
               
	}
	void Hall() {
		 if(Name != null && ID !=null && type !=null) {
             if(type == "Birthday hall" ) {
            	   System.out.println("Birthday hall is booked");
            	   
            	   
               }
             else if(type == "Party hall" ) {
          	   System.out.println("Party hall is booked");
          	   
          	   
             }
             
             else {
             	  throw new InvalidReservationException();
            
               }
               
		
		
	}
	
	
	}}
	


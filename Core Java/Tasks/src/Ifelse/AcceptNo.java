package Ifelse;

public class AcceptNo {
	
	void number(int no ) 
{
	if(no==0 ) {
			System.out.println("number is 0");
			
		}
	else if (no>0) {
         System.out.println(  no+ " no is positive ");
       }
	else if (no<0) {
    	   
    	   System.out.println(no +" no is negative");
       }
	
	 }

	
public static void main(String[] args) {
	AcceptNo a = new AcceptNo();
	a.number(10);
	a.number(-100);
	a.number(0);
}	

}

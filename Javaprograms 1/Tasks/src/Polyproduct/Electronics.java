package Polyproduct;

public class Electronics extends Product {
	
	
	String warrantyperiod;
	String brand;
	
	void pinfo(String warrantyperiod,String brand) {
		this.warrantyperiod=warrantyperiod;
		this.brand=brand;
		
		
		
	}
	
	void calculateDiscount(int discount){
	    discount =price-discount;
	    
	    System.out.println(" For electronics discount is 5000  " + pname +" price is ="+ discount );
	}
	
	
	public static void main(String[] args) {
	
		Electronics e1= new Electronics();
		e1.pinfo("Laptp","its specificaton",250000);
	    e1.calculateDiscount(5000);

	}

}

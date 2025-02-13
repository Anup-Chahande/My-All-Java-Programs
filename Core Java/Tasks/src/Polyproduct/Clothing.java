package Polyproduct;

public class Clothing extends Product{
	
	int size;
	String color;
	String material;
	
	
	void other(int size,String color,String material) {
		this.size=size;
		this.color=color;
		this.material=material;
		
		
		
		
	}
	
	void calculateDiscount(int discount){
	    discount =price-discount;
	    
	    System.out.println(" For Cloths discount is 500  " + pname +" price is ="+ discount );
	}

	public static void main(String[] args) {
		Clothing c1=new Clothing();
		
		c1.pinfo("Tshirt","Long sleve T-shirt",3000);
	    c1.calculateDiscount(500);
	}
	
	
	
}

package Polyproduct;

public class Product {
String pname;
String pdiscription;
int price;


void pinfo(String pname,String pdiscription,int price) {
	this.pname=pname;
	this.pdiscription=pdiscription;
	this.price=price;
	
}



void calculateDiscount(int discount){
    discount =price-discount;
    
    System.out.println(" after discount  " + pname +" price is ="+ discount );
}

public static void main(String[] args) {
	Product p1 = new Product();
	Product p2 = new Product();

	
	p1.pinfo("Laptp","its specificaton",250000);
	p2.pinfo("phone","its specificaton",25000);

	p1.calculateDiscount(4500);
	p2.calculateDiscount(1500);

	
	
	
}


}


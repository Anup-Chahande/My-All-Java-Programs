
public class Product {

	
	int productId;
	String productName;
	double price;
	int quentityStock;
	

 Product(int productID,String productName,double price,int quentityStock){
	 this.productId = productID;
     this.productName = productName;
     this.price = price;
     this.quentityStock = quentityStock;
 
 }
   
    Product(){
	 
	 this.productId = 0;
	 this.productName = "";
	 this.price = 0.0;
	 this.quentityStock = 0;
    }
    
    
    void updatequentity(int newquentity) {
    	this.quentityStock = newquentity;
    	
    	
    }
  void printr() {
	  System.out.println("product id : " + productId);
	  System.out.println("product name " + productName); 
	  System.out.println("product price " + price); 
	  System.out.println("product quentity " + quentityStock); 

	  
  }
  
    
    public static void main(String[] args) {
	

    Product product1 = new Product();
    Product product2 = new Product(11135648,"Laptop",100000.00,56);

   
    product1.updatequentity(10);
    product2.updatequentity(1);
    product2.printr();
    product1.printr();

    }
 }
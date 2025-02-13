package InventorySystem;

public class Main {
	public static void main(String[] args) {
		
	
	
		InventoryItem i1 = new InventoryItem("t-shrt" ,10000 );
		InventoryItem i2 = new InventoryItem("bottel" ,9000 );
		InventoryItem i3 = new InventoryItem("jens" ,5000 );
		InventoryItem i4 = new InventoryItem("watch" ,4000 );
		InventoryItem i5 = new InventoryItem("soaps" ,3000 );
		InventoryItem i6 = new InventoryItem("pen" ,200 );
		InventoryItem i7 = new InventoryItem("pensil" ,1000 );

		
       System.out.println("total no of items is " +InventoryItem.totelItems);		
		InventoryItem ii = new InventoryItem( );
         ii.addToInventory(100);
         ii.removeFromInventory(0);
         
         System.out.println("**********************************");		
    
         System.out.println(" iteam names is " + i1.ItemName + " quentity is " + i1.quentity);
 		System.out.println(" iteam names is " + i2.ItemName + " quentity is " + i2.quentity);
 		System.out.println(" iteam names is " + i3.ItemName + " quentity is " + i3.quentity);
 		System.out.println(" iteam names is " + i4.ItemName + " quentity is " + i4.quentity);
 		System.out.println(" iteam names is " + i5.ItemName + " quentity is " + i5.quentity);
 		System.out.println(" iteam names is " + i6.ItemName + " quentity is " + i6.quentity);
 		System.out.println(" iteam names is " + i7.ItemName + " quentity is " + i7.quentity);
 
	}
	}


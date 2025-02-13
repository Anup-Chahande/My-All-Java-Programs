package InventorySystem;

public class InventoryItem {
	static int totelItems;
	 String ItemName;
	 int quentity;

	InventoryItem() {
	}

	InventoryItem(String ItemName, int quentity) {
		this.ItemName = ItemName;
		this.quentity = quentity;
		totelItems++;
	}

	int getTotelitems() {

		return totelItems;

	}

	void addToInventory(int itemQuentity) {
		System.out.println("book is added : quentity is : " + itemQuentity + " now total item is " + ++totelItems);

	}

	void removeFromInventory(int itemQuentity) {

		System.out.println("book is removed : quentity is : " + itemQuentity + " now total item is " + --totelItems);

	}

	
		
	

}

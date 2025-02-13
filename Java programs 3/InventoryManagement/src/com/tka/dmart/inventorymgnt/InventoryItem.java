package com.tka.dmart.inventorymgnt;

public class InventoryItem {

	static int totalItems;
	static String itemName;
	static int quantity;

	public InventoryItem() {
	}

	public InventoryItem(String itemName, int quantity) {
		this.itemName = itemName;
		this.quantity = quantity;
		totalItems++;
	}

	static int getTotalItems() {

		return totalItems;
	}

	void addToInventory(int item) {

	}

	void removeFromInventory(int item) {

	}

	void printAllItem() {
		System.out.println("********** Item Info***********");
		System.out.println(itemName +"  =  "+quantity);
		System.out.println("********** Item Info***********");
	}

}

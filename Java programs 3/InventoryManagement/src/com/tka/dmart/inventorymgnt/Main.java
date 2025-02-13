package com.tka.dmart.inventorymgnt;

public class Main {

	public static void main(String[] args) {
		InventoryItem iv1 = new InventoryItem("pepsi", 1000);
		InventoryItem iv2 = new InventoryItem("icecream", 2000);
		InventoryItem iv3 = new InventoryItem("maggie", 50000);
		InventoryItem iv4 = new InventoryItem("ParleG", 4000);
		InventoryItem iv5 = new InventoryItem("Cadburry", 45000);
		InventoryItem iv6 = new InventoryItem("shirt", 1500);

		System.out.println("Total Item in Dmart = " + InventoryItem.getTotalItems());

		InventoryItem iv = new InventoryItem();
		iv.printAllItem();
	}
}

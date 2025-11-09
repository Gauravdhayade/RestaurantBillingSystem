package com.restaurant.main;

import com.restaurant.model.*;
import com.restaurant.service.*;
import com.restaurant.util.InputHelper;

public class RestaurantApp {
	public static void main(String[] args) {
		MenuManager menuManager = new MenuManager();
		BillingManager billingManager = new BillingManager();
		Order order = new Order();

		int choice;
		do {
			System.out.println("\n========= WELCOME TO THE JAVA BITE =========");
			System.out.println("1️⃣  Show Menu");
			System.out.println("2️⃣  Add Menu Item");
			System.out.println("3️⃣  Remove Menu Item");
			System.out.println("4️⃣  Take Customer Order");
			System.out.println("5️⃣  Print Bill");
			System.out.println("0️⃣  Exit");
			System.out.println("===========================================");

			choice = InputHelper.getInt("Enter your choice: ");

			switch (choice) {
			case 1 -> menuManager.showMenu();
			case 2 -> {
				String name = InputHelper.getString("Enter new item name: ");
				double price = InputHelper.getDouble("Enter price: ");
				menuManager.addFoodItem(name, price);
				System.out.println("✅ Item added successfully!");
			}
			case 3 -> {
				menuManager.showMenu();
				int id = InputHelper.getInt("Enter item ID to remove: ");
				menuManager.removeFoodItem(id);
				System.out.println("🗑️ Item removed successfully!");
			}
			case 4 -> {
				if (menuManager.isEmpty()) {
					System.out.println("⚠️  Menu is empty. Please add items first!");
					break;
				}
				menuManager.showMenu();
				int itemId = InputHelper.getInt("Enter item ID to order: ");
				FoodItem item = menuManager.getItemById(itemId);
				if (item == null) {
					System.out.println("❌ Invalid item ID!");
					break;
				}
				int qty = InputHelper.getInt("Enter quantity: ");
				order.addItem(item, qty);
				System.out.println("🛒 Item added to order!");
			}
			case 5 -> {
				if (order.isEmpty()) {
					System.out.println("⚠️ No items ordered yet!");
					break;
				}
				billingManager.printInvoice(order);
			}
			case 0 -> System.out.println("👋 Exiting... Have a great day!");
			default -> System.out.println("❌ Invalid choice! Try again.");
			}

		} while (choice != 0);
	}
}

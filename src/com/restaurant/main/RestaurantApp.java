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
			System.out.println("\n============= WELCOME TO THE JAVA BITE=============");
			System.out.println("1️ Show Menu");
			System.out.println("2️ Add Menu Item");
			System.out.println("3️ Remove Menu Item");
			System.out.println("4️ Take Customer Order");
			System.out.println("5️ Print Bill");
			System.out.println("0️ Exit");
			System.out.println("===========================================");

			choice = InputHelper.getInt("Enter your choice: ");

			switch (choice) {
			case 1 -> menuManager.showMenu();
			case 2 -> {
				String name = InputHelper.getString("Enter new item name: ");
				double price = InputHelper.getDouble("Enter price: ");
				menuManager.addFoodItem(name, price);
				System.out.println(" Item added successfully!");
			}
			case 3 -> {
				menuManager.showMenu();
				int id = InputHelper.getInt("Enter item ID to remove: ");
				menuManager.removeFoodItem(id);
				System.out.println("Item removed successfully!");
			}
			case 4 -> {
			    if (menuManager.isEmpty()) {
			        System.out.println("Menu is empty. Please add items first!");
			        break;
			    }

			    menuManager.showMenu();

			    String input = InputHelper.getString("Enter item IDs to order");
			    String[] ids = input.split(",");

			    for (String idStr : ids) {
			        int itemId = Integer.parseInt(idStr.trim());
			        FoodItem item = menuManager.getItemById(itemId);

			        if (item == null) {
			            System.out.println("❌ Invalid item ID: " + itemId);
			            continue;
			        }

			        int qty = InputHelper.getInt("Enter quantity for " + item.getName() + ": ");
			        order.addItem(item, qty);
			        System.out.println("✔ Added: " + item.getName() + " x" + qty);
			    }
			}

			case 5 -> {
				if (order.isEmpty()) {
					System.out.println("No items ordered yet!");
					break;
				}
				billingManager.printInvoice(order);
			}
			case 0 -> System.out.println("Exiting... Have a great day!");
			default -> System.out.println("Invalid choice! Try again.");
			}

		} while (choice != 0);
	}
}

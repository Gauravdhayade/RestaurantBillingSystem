package com.restaurant.service;

import com.restaurant.model.FoodItem;
import java.util.ArrayList;
import java.util.List;

public class MenuManager {
	private List<FoodItem> menu = new ArrayList<>();
	private int nextId = 1;

	public MenuManager() {
		// Default menu
		addFoodItem("Margherita Pizza", 299);
		addFoodItem("Cheese Sandwich", 120);
		addFoodItem("French Fries", 80);
		addFoodItem("Mango Shake", 110);
		addFoodItem("Ice-Cream", 65);
		addFoodItem("Apple Shake", 110);
	}

	public void addFoodItem(String name, double price) {
		menu.add(new FoodItem(nextId++, name, price));
	}

	public void removeFoodItem(int id) {
		menu.removeIf(item -> item.getId() == id);
	}

	public void showMenu() {
		if (menu.isEmpty()) {
			System.out.println("⚠️  Menu is currently empty!");
			return;
		}
		System.out.println("\n---------- MENU ----------");
		menu.forEach(System.out::println);
		System.out.println("--------------------------");
	}

	public FoodItem getItemById(int id) {
		return menu.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
	}

	public boolean isEmpty() {
		return menu.isEmpty();
	}
}

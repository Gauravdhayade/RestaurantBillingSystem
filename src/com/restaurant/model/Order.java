package com.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderItem> items = new ArrayList<>();

	public void addItem(FoodItem foodItem, int qty) {
		items.add(new OrderItem(foodItem, qty));
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}
}

package com.restaurant.service;

import com.restaurant.model.Order;
import com.restaurant.model.OrderItem;

public class BillingManager {
	private static final double GST_RATE = 0.05;
	private static final double SERVICE_CHARGE = 0.02;
	private static final double DISCOUNT_THRESHOLD = 500;
	private static final double DISCOUNT_RATE = 0.10;

	public void printInvoice(Order order) {
		System.out.println("\n=========================================");
		System.out.println("          THE JAVA BITE RESTAURANT");
		System.out.println("=========================================");
		double subtotal = 0;

		System.out.printf("%-20s %-10s %-10s%n", "Item", "Qty", "Amount");
		System.out.println("-----------------------------------------");

		for (OrderItem orderItem : order.getItems()) {
			double total = orderItem.getTotal();
			subtotal += total;
			System.out.printf("%-20s %-10d ₹%-10.2f%n", orderItem.getFoodItem().getName(), orderItem.getQuantity(),
					total);
		}

		System.out.println("-----------------------------------------");

		double gst = subtotal * GST_RATE;
		double service = subtotal * SERVICE_CHARGE;
		double discount = subtotal > DISCOUNT_THRESHOLD ? subtotal * DISCOUNT_RATE : 0;
		double grandTotal = subtotal + gst + service - discount;

		System.out.printf("Subtotal:           ₹%.2f%n", subtotal);
		System.out.printf("GST (5%%):           ₹%.2f%n", gst);
		System.out.printf("Service Charge (2%%): ₹%.2f%n", service);
		if (discount > 0)
			System.out.printf("Discount (10%%):     -₹%.2f%n", discount);
		System.out.println("-----------------------------------------");
		System.out.printf("Grand Total:        ₹%.2f%n", grandTotal);
		System.out.println("=========================================");
		System.out.println("        Thank You! Visit Again 🍽️");
	}
}

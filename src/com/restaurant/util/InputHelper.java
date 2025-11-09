package com.restaurant.util;

import java.util.Scanner;

public class InputHelper {
	private static final Scanner scanner = new Scanner(System.in);

	public static int getInt(String msg) {
		System.out.print(msg);
		while (!scanner.hasNextInt()) {
			System.out.print("❌ Enter a valid number: ");
			scanner.next();
		}
		return scanner.nextInt();
	}

	public static double getDouble(String msg) {
		System.out.print(msg);
		while (!scanner.hasNextDouble()) {
			System.out.print("❌ Enter a valid price: ");
			scanner.next();
		}
		return scanner.nextDouble();
	}

	public static String getString(String msg) {
		System.out.print(msg);
		return scanner.next();
	}
}

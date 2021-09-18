package com.nt.sdp;

public class Printer {
	private static Printer INSTANCE;

	private Printer() {
		System.out.println("Printer.0-param Constructor");
	}

	public static Printer getInsatance() {
		if (INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
	public void print(String msg) {
		System.out.println(msg);
	}
}

package com.nt.Test;

import com.nt.sdp.Printer;

public class SingletonTest1 {

	public static void main(String[] args) {
		Printer p1=Printer.getInsatance();
		Printer p2=Printer.getInsatance();
		System.err.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2 ? : "+(p1==p2));

	}

}

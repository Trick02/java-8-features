package com.trick02.java8;

public interface Vehicle {

	public int getSpeed();

	public void applyBreak();

	public default void autoPilot() {
		System.out.println("I will help in driving with out manual support");
	}
	
	public static void sayHello() {
		System.out.println("Hi, This is your favourite car");
	}
}

package com.trick02.java8;

public class Honda implements Vehicle {

	@Override
	public int getSpeed() {
		return 100;
	}

	@Override
	public void applyBreak() {
		System.out.println("Breaks applied");
	}
	
	@Override
	public void autoPilot() {
		System.out.println("Honda Auto pilot applied");
	}

	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.applyBreak();
		honda.autoPilot();
		Vehicle.sayHello();
		Honda.sayHello();
	}
	
	private static void sayHello() {
		System.out.println("Hi, This is your favourite honda car");
	}
}

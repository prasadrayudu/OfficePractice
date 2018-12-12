package org.abstract_.example;

public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Car is starting..");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Car is riding..");
		
	}

	@Override
	public void shutdown() {
	System.out.println("Car gonna shutdown the engine..");
		
	}

}

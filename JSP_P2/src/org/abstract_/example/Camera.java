package org.abstract_.example;

public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera is Starting..");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Camera gonna take Picture of the scenary..");
		
	}

	@Override
	public void shutdown() {
			System.out.println("Camera gonna shutdown..");
		
	}

}

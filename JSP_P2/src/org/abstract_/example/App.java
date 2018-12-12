package org.abstract_.example;

public class App {
	public static void main(String[] args)
	{
	
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car = new Car();
		car.setId(7);
		
	//	Machine machine = new Machine();
		
		cam1.run();
		car.run();
				
		
		
	}

}

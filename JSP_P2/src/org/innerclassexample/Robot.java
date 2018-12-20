package org.innerclassexample;

public class Robot {

	private int id;

	class Brain {
		public void think()

		{
			System.out.println("Robot " + id + " is thinking");
		}
	}
	
	public static class Battery {
		public void charge()
		{
			System.out.println("Battery is charging..");
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("starting Robot " + id);
			Brain brain = new Brain();
			brain.think();
			final String name = "prasad";
			class Temp
			{
				public void doSomething()
				{
					System.out.println("Id " +id);
					System.out.println("Name " +name);
				}
			}
			Temp temp = new Temp();
			temp.doSomething();


	}


	
}

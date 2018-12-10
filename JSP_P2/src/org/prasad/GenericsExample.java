package org.prasad;

import java.util.ArrayList;

class Machine
{

	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	
	public void start()
	{
		System.out.println("Machine is Starting..");
	}
	
	
}

class Camera extends Machine
{
	@Override
	public String toString() {
		return "I am a Camera";
	}

	public void snap() {
		System.out.println("Capture the Snap");
	}
	
}


public class GenericsExample {

	public static void main(String[] args) {

		
		ArrayList<Machine> list1 = new ArrayList<>();
		
		list1.add(new Machine());
		list1.add(new Machine());


		ArrayList<Camera> list2 = new ArrayList<>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list1);	
		
		showList1(list2);		
		
		

	}

	public static void showList(ArrayList<Machine> list)
	{
	   for(Machine value : list)
	   {
		   System.out.println(value);
		   value.start();
	   }
	}
	public static void showList1(ArrayList<Camera> list)
	{
	   for(Camera value : list)
	   {
		   System.out.println(value);
		   value.snap();
	   }
	}



}

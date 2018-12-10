package org.prasad;

import java.util.ArrayList;

class Samsung
{

	@Override
	public String toString() {
		return "I am a Samsung Mobile";
	}
	
	
	public void start()
	{
		System.out.println("Mobile is Starting..");
		System.out.println(" ");
	}
	
	
}

class Edge extends Samsung
{
	@Override
	public String toString() {
		return "I am a SamsungEdge";
	}
	@Override
	public void start() {
		System.out.println("Samsung Edge starting..");
		System.out.println(" ");
	}
	
}


public class WildcardExample {

	public static void main(String[] args) {

		
		ArrayList<Samsung> list1 = new ArrayList<>();
		
		list1.add(new Samsung());
		list1.add(new Samsung());


		ArrayList<Edge> list2 = new ArrayList<>();
		
		list2.add(new Edge());
		list2.add(new Edge());
		
		showList(list1);	
		
		showList1(list2);		
		
		

	}

	public static void showList(ArrayList<? extends Samsung> list)
	{
	   for(Samsung value : list)
	   {
		   System.out.println(value);
		   value.start();
	   }
	}
	public static void showList1(ArrayList<? super Edge> list)
	{
	   for(Object value : list)
	   {
		   System.out.println(value);
		   ((Samsung) value).start();
		  
	   }
	}



}

package org.prasad;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionMap {

	public static void main(String args[])
	{
		HashMap<Integer, String> hashMap = new HashMap<>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		TreeMap<Integer, String> treeMap = new TreeMap<>();
	
		testMap(hashMap);
		System.out.println();
		testMap(linkedHashMap);
		System.out.println();
		testMap(treeMap);
		
		
	}
		public static void testMap(Map<Integer, String> map)
		{
			map.put(9,"prasad");
			map.put(8,"prasa");
			map.put(7,"pras");
			map.put(6,"pra");
			map.put(5,"pr");
			map.put(4,"p");
			map.put(3,"Rayudu");
			
			for(Integer key:map.keySet())
			{
				String value=map.get(key);
				System.out.println(key + ": " + value);
			}	
			
			
		}
	
	
	
	
	
}

package org.prasad;

import java.io.FileWriter;

import java.io.IOException;

public class FileHandlingExample {
	
	public static void main(String[] args) throws IOException
	{
		
	String str = "prasad" + " Rayudu" ;
	
	
	FileWriter fw = new FileWriter("text");

	for(int i=0;i<str.length();i++)
	{
         System.out.print(str.charAt(i));
	}
	
	
	
	fw.close();
	
	
	
	
	}
	

}

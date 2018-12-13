package org.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {

		File f = new File("Test1.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f)))
		{
		    bw.write("Hello Everyone");
		    bw.newLine();
		    bw.write("--------------------");
		    bw.newLine();
		    bw.write("Welcome Prasad Rayudu");
		
		}catch(IOException e)
		{
			System.out.println("Unable to read file" +f.toString());
		}
	
		
	}

}

package org.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	
	public static void main(String[] args) {
		
		System.out.println("Writing the Objects..");

		Person mike = new Person(23,"Mike");
		Person sai = new Person(24,"Sai");
		
		System.out.println(mike);
		System.out.println(sai);
		
		try(FileOutputStream fs = new FileOutputStream("text"))
		{
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			 os.writeObject(mike);
			 os.writeObject(sai);
			
			 os.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
	
	
	
	}
}

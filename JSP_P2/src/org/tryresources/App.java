package org.tryresources;

class Temp implements AutoCloseable
{

	@Override
	public void close() throws Exception {
	
		System.out.println("Closing..!");
		
	}
	
}



public class App {
	public static void main(String[] args) {
		
	/*	Temp temp = new Temp();
		
		try {
			temp.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		// Java 7 Feature - Try with Resources..
		try(Temp temp = new Temp()){
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

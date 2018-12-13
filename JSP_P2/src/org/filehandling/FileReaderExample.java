package org.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {

		File file = new File("test1.txt");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}

		} catch (FileNotFoundException e) {
			System.out.println("File not Found" + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read the file" + file.toString());
		} finally {
			try {
				br.close();
				} catch (IOException e) {
					System.out.println("Unable to close the file" + file.toString());
				} catch (NullPointerException ex) {
					System.out.println("File was probably never opened");
				}

		}
	}

}

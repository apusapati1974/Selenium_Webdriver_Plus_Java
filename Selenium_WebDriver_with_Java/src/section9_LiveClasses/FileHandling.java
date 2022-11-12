package section9_LiveClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	
	public void readDataFromFile(String filepath,String filename) throws IOException {
		
		File f = new File("C:/text/files/InputData.txt");
		FileReader fr = new FileReader(f);
		
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		FileHandling obj = new FileHandling();
		obj.readDataFromFile("C:/text/files", "InputData.txt");
	}
}

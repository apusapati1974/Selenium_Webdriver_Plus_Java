package section9_LiveClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_FileHandling {
	
	public void readDataFromFile(String filepath,String filename) throws IOException {
		
		File f =  new File(filepath+"/"+filename);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		while(s!=null) {
			System.out.println(s);
			s = br.readLine();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		Buffered_FileHandling obj = new Buffered_FileHandling();
		obj.readDataFromFile("C:/text/files", "InputData.txt");
	}
	
}

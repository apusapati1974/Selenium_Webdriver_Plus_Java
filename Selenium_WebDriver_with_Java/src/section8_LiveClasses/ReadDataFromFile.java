package section8_LiveClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
	
	public void readData() throws IOException {
		File f = new File("E:\\TestData.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		while(s!=null) {
			System.out.println(s);
			s = br.readLine();
		}
	}
	public static void main(String[] args) throws IOException {
		ReadDataFromFile obj = new ReadDataFromFile();
		obj.readData();
	}
}

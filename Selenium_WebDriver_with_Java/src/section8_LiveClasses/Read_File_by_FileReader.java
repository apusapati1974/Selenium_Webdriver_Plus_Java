package section8_LiveClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File_by_FileReader {
	
	public void readTextData() throws IOException {
		
		File f = new File("E:\\TestData.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
	}
	public static void main(String[] args) throws IOException {
		Read_File_by_FileReader fr = new Read_File_by_FileReader();
		fr.readTextData();
	}
}

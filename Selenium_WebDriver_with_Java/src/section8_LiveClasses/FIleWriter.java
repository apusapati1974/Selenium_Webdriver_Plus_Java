package section8_LiveClasses;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriter {
	
	public void writeData() throws IOException {
		File f = new File("E:\\TestData1.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This is Anudeep");
		fw.flush();
		fw.close();
		
	}
	public static void main(String[] args) throws IOException {
		FIleWriter fw = new FIleWriter();
		fw.writeData();
	}
}

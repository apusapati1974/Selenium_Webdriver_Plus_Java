package section8_LiveClasses;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dynamic_FileWriter {
	
	public void writeData(String data) throws IOException {
		// Write the file in Append mode.
		File f = new File("E://TestData1.txt");
		FileWriter fw = new FileWriter(f, true);
		fw.write(data);
		fw.flush();
		fw.close();
	}
	public static void main(String[] args) throws IOException {
		Dynamic_FileWriter fw = new Dynamic_FileWriter();
		fw.writeData("\n This is Krish ");
	}
}

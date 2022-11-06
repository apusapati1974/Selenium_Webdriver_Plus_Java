package section8_LiveClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_FileWriter {
	
	public void writeData(String data) throws IOException {
		File f = new File("E://TestData1.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(data);
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		Buffered_FileWriter obj = new Buffered_FileWriter();
		obj.writeData("This is Testing World");
	}
}

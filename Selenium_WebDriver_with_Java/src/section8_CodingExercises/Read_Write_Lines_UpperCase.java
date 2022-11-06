package section8_CodingExercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_Lines_UpperCase {
	
	public void writeLinesUpperCase() throws IOException {
		
		File f2 = new File("./InputFiles/File2.txt");
		File f5 = new File("./InputFiles/File5.txt");
		
		FileReader fr2 = new FileReader(f2);
		FileWriter fr5 = new FileWriter(f5);
		
		BufferedReader br2 = new BufferedReader(fr2);
		BufferedWriter bw5 = new BufferedWriter(fr5);
		
		String readData = br2.readLine();
		while(readData!=null) {
			if(readData.contains("Error") || readData.contains("error")) {
				bw5.write(readData);
				System.out.println(readData);
				bw5.newLine();
			}
			readData = br2.readLine();
		}
		bw5.flush();
		bw5.close();
	}
	public static void main(String[] args) throws IOException {
		Read_Write_Lines_UpperCase obj = new Read_Write_Lines_UpperCase();
		obj.writeLinesUpperCase();
	}
	
}

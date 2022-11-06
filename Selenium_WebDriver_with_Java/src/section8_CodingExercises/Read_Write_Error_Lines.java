package section8_CodingExercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_Error_Lines {
	
	public void copyErrorLines() throws IOException {
		
		File f1 = new File("./InputFiles/File2.txt");
		File f4 = new File("./InputFiles/File4.txt");
		
		FileReader fr1 = new FileReader(f1);
		FileWriter fw = new FileWriter(f4);
		
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedWriter bw4 = new BufferedWriter(fw);
		
		String readData = br1.readLine();
		while(readData!=null) {
			if(readData.contains("Error") || readData.contains("error")) {
				bw4.write(readData);
				System.out.println(readData);
				bw4.newLine();
			}
			readData = br1.readLine();
		}
		bw4.flush();
		bw4.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		Read_Write_Error_Lines obj = new Read_Write_Error_Lines();
		obj.copyErrorLines();
	}
}

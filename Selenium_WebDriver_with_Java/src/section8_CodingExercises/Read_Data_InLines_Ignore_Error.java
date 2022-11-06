package section8_CodingExercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_InLines_Ignore_Error {
	
	public void ignoreErrorLines() throws IOException {
		
		File f = new File("./InputFiles/File2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String readData = br.readLine();
		while(readData!=null) {
			if(!readData.contains("Error") && !readData.contains("error")) {
				System.out.println(readData);
			}
			readData = br.readLine();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		Read_Data_InLines_Ignore_Error file = new Read_Data_InLines_Ignore_Error();
		file.ignoreErrorLines();
	}
}

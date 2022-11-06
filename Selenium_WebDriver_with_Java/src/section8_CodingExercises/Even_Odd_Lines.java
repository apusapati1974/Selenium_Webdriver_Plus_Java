package section8_CodingExercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Even_Odd_Lines {
	
	public void readOddLines() throws IOException {
		
		File f1 = new File("./InputFiles/File1.txt");
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		
		String readData = br1.readLine();
		while(readData!=null) {
			System.out.println(readData);
			readData = br1.readLine();
			readData = br1.readLine();
		}
	}
	
	 public void readEvenLines() throws IOException {
		 File f1 = new File("./InputFiles/File1.txt");
		 FileReader fr1 = new FileReader(f1);
		 BufferedReader br1 = new BufferedReader(fr1);
		 
		 String readData = br1.readLine();
		 readData = br1.readLine();
		 while(readData!=null) {
			 System.out.println(readData);
			 readData = br1.readLine();
			 readData = br1.readLine();
		 }
	 }
	 
	 public static void main(String[] args) throws IOException {
		
		 System.out.println("---------- Read Odd Lines ----------");
		 Even_Odd_Lines file = new Even_Odd_Lines();
		 file.readOddLines();
		 System.out.println("---------- Read Even Lines ----------");
		 file.readEvenLines();
		 
	}
}

package section8_CodingExercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_And_Write_Data {
	
	public void readWrite2Files() throws IOException {
		
		File f1 = new File("./InputFiles/File1.txt");
		File f2 = new File("./InputFiles/File2.txt");
		File f3 = new File("./InputFiles/File3.txt");
		
		FileReader fr1 = new FileReader(f1);
		FileReader fr2 = new FileReader(f2);
		FileWriter fw = new FileWriter(f3);
		
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readData = br1.readLine();
		while(readData!=null) {
			bw.write(readData);
			readData = br1.readLine();
			bw.newLine();
		}
		
		String readData1 = br2.readLine();
		while(readData1!=null) {
			bw.write(readData1);
			readData1 = br2.readLine();
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		Read_And_Write_Data obj = new Read_And_Write_Data();
		obj.readWrite2Files();
	}
}

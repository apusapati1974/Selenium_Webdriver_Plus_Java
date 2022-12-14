package section15_LiveClasses;

import java.io.IOException;

public class Property_File_Reader_MainMethod {

	public static void main(String[] args) throws IOException {
		
		Property_File_Reader pfr = new Property_File_Reader();
		pfr.fetchPropertyData("Global_SQA");

	}

}

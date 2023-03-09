package libexam05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TextFileReadExam02 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1]);
			int readLen = 0;
			char[] readData = new char[20];
			
			while ( (readLen=fr.read(readData)) != -1) {
				fw.write(readData, 0, readLen);
			}
			fw.close(); fr.close();
//			fr.read(null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

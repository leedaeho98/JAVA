package libexam05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BinaryFileReadWrite04 {
	public static void main(String[] args) {
		
		FileInputStream fr = null;
//		FileWriter fw = null;
		FileOutputStream fw = null;
		
		try {
			fr = new FileInputStream(args[0]);
			fw = new FileOutputStream(args[1]);
			int readLen = 0;
			byte[] readData = new byte[20];
			
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

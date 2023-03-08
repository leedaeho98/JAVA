package libexam05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileReadWrite04_02 {
	
	public static void main(String[] args) {
		// 하나만 읽는다
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		try {
			fr = new FileInputStream(args[0]);
			fw = new FileOutputStream(args[1]);
			int readData = 0;
			
			while ( (readData=fr.read()) != -1) {
				fw.write((readData -1));
			}
			fw.close(); fr.close();
//			fr.read(null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

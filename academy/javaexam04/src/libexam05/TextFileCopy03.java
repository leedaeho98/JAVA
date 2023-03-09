package libexam05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 오류 뜨는 이유 => args설정 안해서 그렇습니다
public class TextFileCopy03 {
	public static void main(String[] args) {
		FileReader fr= null;
		FileWriter fw= null;
		
		try {
			fr= new FileReader(args[0]);
			fw = new FileWriter(args[1]);
			int readLen = 0;
			char[] readData = new char[20];
			while( (readLen=fr.read(readData)) != -1) {
				fw.write(readData, 0, readLen);
			}
			fw.close(); fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

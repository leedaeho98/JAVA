package libexam06;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestFileReadExam02_2 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("test.txt");
			
			int readcheck = -255;
			char[] readData = new char[1024];
			while( (readcheck=fr.read(readData) ) != -1) {
				for(int i = 0; i < readcheck; i++) {
					System.out.print(readData[i]);
				}
			}
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

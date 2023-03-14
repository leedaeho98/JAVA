package exam01;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamRead implements FileReadInter {

	@Override
	// 읽어서 가져온 파일
	public String readText(String fileName) {
		StringBuilder sb = new StringBuilder();
		char[] readData = new char[5];
		int readCount = 0;
		try {
			FileReader fr = new FileReader(fileName);
			while( (readCount=fr.read(readData)) != -1) {
				sb.append(readData, 0 , readCount);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//파일로부터 읽어들인다
		
		return sb.toString(); // 문자열로 변환
	}

}

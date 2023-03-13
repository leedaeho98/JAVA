package exam01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanRead implements FileReadInter {

	@Override
	// 
	public String readText(String fileName) {
		// String readData = "";
		StringBuilder sb = new StringBuilder();
		try {
			Scanner scan = new Scanner(new File(fileName));
			while (scan.hasNext()) { // 다음
				sb.append(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//파일로부터 읽어들인다
		
		return sb.toString(); // 문자열로 변환
		//return readData;
	}

}

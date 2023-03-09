package libexam05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileSaveExam01 {

		public static void main(String[] args) {
		try {

		FileWriter fw = new FileWriter("test.txt");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0 ; i <  5 ; i++) {
			System.out.println("입력하세여요............");
			String inputString = scanner.nextLine();
			
			fw.write(inputString+"\n");
			
			fw.write("=========문자열 배열 저장 =============== \n");
			char[] charArrData = "yangdoll 양돌 홍길동 김순이".toCharArray(); // 문자열 배열로 바꿔준다
			fw.write(charArrData);
		}
		fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}

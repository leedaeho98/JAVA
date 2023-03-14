package libexam05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BinaryFileReadWrite04_last {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String source ="", target="";
	
		if (args.length != 2) {
			System.out.println("소스파일을 입력해주세요...");
			source = scan.next();
			System.out.println("타겟(복사될)파일명을 입력해주세요...");
			target = scan.next();
		}
		
		if (args.length == 2) {
			source = args[0];
			target = args[1];
		}
		
		System.out.println("원하는 작업을 선택하세요[1:변환(암호화), 2:복구(복호화)]");
		int select = scan.nextInt();
		if(select == 1) {
			fileEncode( source, target);
		}else {
			fileDecode( source, target);
		}

	}
	public static void fileEncode(String source, String target) { // 암호화 하는 메소드
	FileInputStream fr = null;
	FileOutputStream fw = null;
		try {
			fr = new FileInputStream(source);
			fw = new FileOutputStream(target);
			int readData = 0;
			byte[] writeDataArr = new byte[10];
			Random rnd = new Random();
			for (int i = 0 ; i < writeDataArr.length ; i++) {
				writeDataArr[i]=(byte)rnd.nextInt(116); // 배열의 쓰레기 값을 채운다
			}
			while ( (readData=fr.read()) != -1) {
				int rdp = rnd.nextInt(9); // 3이 난술호 만들어졌다면
				writeDataArr[rdp] = (byte) readData; // 배열의 세번째 인덱스에 실제 값이 저장되어 있다.
				writeDataArr[9] = (byte) (116 + rdp); // 123은 기준값
				fw.write(writeDataArr);
			}
			fw.close(); fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void fileDecode(String source, String target) { // 복원메소드
		FileInputStream fr = null;
		FileOutputStream fw = null;
		
		try {
			fr = new FileInputStream(source);
			fw = new FileOutputStream(target);
			int readData = 0;
			byte[] readDataArr = new byte[10];

			while ( (readData=fr.read(readDataArr)) != -1) {
				int arrRealData = readDataArr[readDataArr[9]-116];
				fw.write(arrRealData);
			}
			fw.close(); fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package libexam05;

import java.io.File;
import java.util.Date;

public class DirList05 {

	public static void main(String[] args) {
	// 이클립스를 활용한 프롬포트 javaexam04에 dir
		File files = null;
		files = new File("."); // 상위폴더인 javaexam03을 가리킨다
		File[] fileList = files.listFiles(); // 파일을 배열로 변환
		int fileCount = 0;
		int dirCount = 0;
		long fileTotalSize = 0;
		
		for( int i = 0 ; i < fileList.length ; i++) {
			Date cdate = new Date(fileList[i].lastModified());
			if (fileList[i].isDirectory()){ // 폴더면은
				System.out.printf("%1$tY-%1$tm-%1$td-%1$tH:%1$tM:%1$tS초" , cdate);
				System.out.println("       <DIR>          " + fileList[i].getName());
				dirCount += 1;
			}
			if (fileList[i].isFile()) { // 파일이면은
				long fileSize =  fileList[i].length();
				System.out.printf("%1$tY-%1$tm-%1$td-%1$tH:%1$tM:%1$tS초" , cdate);
				System.out.printf("       %,11d    %s %n"  , fileList[i].length(), fileList[i].getName());
				fileCount += 1;
				fileTotalSize += fileSize;
			}
		}
		System.out.printf("              %d개의 파일       %,10d 바이트 %n",fileCount,fileTotalSize);
		System.out.printf("              %d개의 디렉토리    %,10d 바이트 남음 %n",dirCount,fileList[0].getUsableSpace());
	}
}

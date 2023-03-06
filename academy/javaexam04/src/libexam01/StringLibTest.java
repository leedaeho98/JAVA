package libexam01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLibTest {
	public static void main(String[] args) {
		int i;
		String strData = "yangdoll               dolltest";
		String strWords[]=strData.split("\\s+"); // "\\s+" 공백들을 의미하는 정규표현식이다
		System.out.println(Arrays.deepToString(strWords));
		// 2차원 배열을 출력하려면 deeptoString을 써야한다
		
		// 문자열자료중에서 시작하는 문자열에 해당하는지 그 결과를 얻을 수 있다		
		String[] rtnFileList = DirFileList.dirFileRead();
		System.out.println(Arrays.deepToString(rtnFileList));
		
		List<String> fileFilterList = new ArrayList<String>(); 
		// .png로 끝나는 파일 목록을 저장할 가변 배열
		// List
		int FileCount = rtnFileList.length;
		for (i = 0; i < FileCount; i = i + 1) { // for문에 랭스를 넣는 습관은 안 좋다
			if(rtnFileList[i].endsWith(".png")) {
				fileFilterList.add(rtnFileList[i]); // fileFilterList안에 png파일을 담는다
			}
		}
		System.out.println("============ 결과 출력 ===========");
		int filterCnt = fileFilterList.size();
		
		for (i = 0 ; i < filterCnt ; i = i + 1) {
			System.out.println(fileFilterList.get(i));
		}
	}
}
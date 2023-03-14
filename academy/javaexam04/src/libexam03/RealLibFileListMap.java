package libexam03;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RealLibFileListMap {
	public void mapFileList(String rootDirName) {
		Map<String, List<String>> mapInfo = new HashMap<>();
		File file = new File(rootDirName);
		File[] subFiles=file.listFiles(); // 이 폴더에 있는 파일의 목록을 다 읽어오고 파일타입으로 반환
		
		for (int i = 0 ; i < subFiles.length ; i += 1) {
			if (subFiles[i].isDirectory()) { // 서브파일이 폴더면 출력 (isDirectory=>이것이 폴더면)
				// (subFiles[i].toString.substring(2) Map에 키값으로 사용될 목록이다.
//				System.out.println("키값으로 저장된 문자열 " + subFiles[i].toString().substring(2));
				File subDir = new File(subFiles[i].toString());
				String[] subDirlist = subDir.list();
//				System.out.println(Arrays.toString(subDirlist));
				List<String> list = new ArrayList<>();
				
				for (int j = 0 ; j < subDirlist.length ; j = j + 1) {
					list.add(subDirlist[j]);
				}
				mapInfo.put(subFiles[i].toString(), list);
				
				
			}
		}
		mapInfoPrint(mapInfo); // 실제로 출력하는것이 아닌 클라이언트에게 mapInfo을 네트워크로 넘겨준다.(자바스크립트에서 받을수있다)
	}
	private void mapInfoPrint(Map<String, List<String>> mapInfo) {
		Iterator<String> iter =  mapInfo.keySet().iterator(); 
		while(iter.hasNext()) {
			String keyString = iter.next(); // 키(파일) 값을 얻음
			System.out.println(keyString + "에 저장된 파일 목록 : ");
			List<String> list = mapInfo.get(keyString); // 데이타(텍스트파일)를 얻고 리스트로 만듬
			for ( int i = 0 ; i < list.size(); i = i+1) {
				System.out.println( list.get(i));
			}
			System.out.println("============================");
		}
	}
}

package interface01;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ObjectCreateFactory {
	
	public static InterExam01 createObj() {
		return new SubInterAddSubtractImpl();
	}
	
	public static InterExam01 createObjText() {
//		return new SubInterAddSubtractImpl();
//      text파일(ObjectInfoma.txt)에 생성해야할 클래스 이름을 작성하고
//		1)그 text파일을 읽어서 파일에 작성된 클래스 이름을 읽어서 2)그 객체를 생성한 후에 3)반환한다.(meta data)
//		Scanner scan = null;
//		StringBuffer readClassnameData = new StringBuffer();
//		try {
//			scan = new Scanner(new File("objectCreateList.txt"));
//			String rData = null;
//			while (  scan.hasNextLine()  ) {
//				rData = scan.nextLine();
//				readClassnameData.append("/"+rData);
//			}
//			System.out.println(readClassnameData);
//			String[] objNameList =  (readClassnameData.substring(1).toString()).split("/");
//			Class t = Class.forName(readClassNameData)			
//			return (InterExam01)t.newInstance();
			// 읽어들인 정보를 이용해서 객체를 생성하는 방법2
		String[] objNameList = nonDuplicate();
		Class<InterExam01> t;
			try {
			t = (Class<InterExam01>) Class.forName(objNameList[0]);
			return t.getDeclaredConstructor().newInstance();
			
			} catch (Exception e) {
			e.printStackTrace();
			} 
		
			return null;
	}

// 미완성이지만 새로운 인터페이스 타입의 구현체를 생성하는 메소드
public static InterStdExam createObjStd() {

//	Scanner scan = null;
//	StringBuffer readClassnameData = new StringBuffer();
//	try {
//		scan = new Scanner(new File("objectCreateList.txt"));
//		String rData = null;
//		while (  scan.hasNextLine()  ) {
//			rData = scan.nextLine();
//			readClassnameData.append("/"+rData);
//		}
//		String[] objNameList =  (readClassnameData.substring(1).toString()).split("/");
		String[] objNameList = nonDuplicate();
		try {
			Class<InterStdExam> t = (Class<InterStdExam>) Class.forName(objNameList[0]);
			return t.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
	
//	return null;
}
	public static String[] nonDuplicate() {
		Scanner scan = null;
		StringBuffer readClassnameData = new StringBuffer();
		try {
			scan = new Scanner(new File("objectCreateList.txt"));
			String rData = null;
			while (  scan.hasNextLine()  ) {
				rData = scan.nextLine();
				readClassnameData.append("/"+rData);
			}
			String[] objNameList =  (readClassnameData.substring(1).toString()).split("/");
			return objNameList;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}

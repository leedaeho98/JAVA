package libexam03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import libexam02.DataObj;

public class LibCollectionExam01 {

	public static void main(String[] args) {
		// E는 자료타입이다 
		// List<String> list => 키값은 숫자로 고정, 데이타만 문자열
		List<String> list = new ArrayList<>();
		
		// 리스트에 값을 추가(add)
		list.add("data1"); // 인덱스 0번
		list.add("data2"); // 인덱스 1번
		
		// 값을 꺼내서 출력 하려면 get을 써야한다.
		// 리스트형은 length가 아닌 size로 크기 출력
		// 중복 허용
		System.out.println(list.get(0)+ "리스트 자료의 개수 : " + list.size()); // String[] listArr = new String[2]; listArr[0]="data1"; 와 같다
		list.add("data1"); 
		System.out.println(list.get(0)+ "리스트 자료의 개수 : " + list.size());
		
		System.out.println("================================");
		
		// K는 데이타를 찾을수 있는 정보(키값) , V는 데이타값
		// 키값 Integer , 데이타 String
		Map<Integer, String> map = new HashMap<>();
		
		// 맵에 값을 추가(put)
		map.put(0, "data1");
		map.put(1, "data2");
		
		System.out.println(map.get(0) + " 맵의 자료의 개수 " + map.size());
		map.put(2, "data1");
		System.out.println(map.get(0) + " 맵의 자료의 개수 " + map.size());
		
		// 맵의 다른 방식
		Map<String, String> phoneInfo = new HashMap<>();
		phoneInfo.put("이대호", "010-8754-2340");
		phoneInfo.put("홍길동", "010-1111-1000");
		System.out.println(phoneInfo.get("이대호"));
		
		// Map의 장점 => Map의 형태로 구성된 자료의 활용 => key도 자료(연산)로 활용할 수 있다
		System.out.println(phoneInfo.get("홍길"+"동"));
		
		System.out.println("=================================");
		
		Map<String, Integer> dataObj = new HashMap<>();
		dataObj.put("aaa",1233);
		dataObj.put("bbb",1200);
		dataObj.put("ccc", 300);
		System.out.println(dataObj.get("aaa"));
		
		System.out.println("==============================");
		
		DataObj dataObj2 = new DataObj();
		dataObj2.aaa = 1233;
		System.out.println(dataObj2.aaa);
		
		System.out.println("===========================================");
		
		// int double String를 다 쓸수 있는 Object를 사용
		Map<String, Object>  dataObjTwoMap = new HashMap<>();
		dataObjTwoMap.put("intData", 12000);
		dataObjTwoMap.put("dbData", 3.14);
		dataObjTwoMap.put("strData", "yangdoll");
		
		System.out.println(dataObjTwoMap.get("dbData"));
		System.out.println((dataObjTwoMap.get("strData") +",     부분문자 =>    " +((String)dataObjTwoMap.get("strData")).substring(4))); // 오브젝트 타입이므로 Strig으로 형변환
	}

}

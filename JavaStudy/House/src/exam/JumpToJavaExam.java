package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JumpToJavaExam {
	public static void main(String[] args) {
		int kor = 80;
		int eng = 75;
		int mat = 55;
		int sum = (kor+eng+mat)/3;
		
		System.out.printf("국어 %d , 영어 %d , 수학 %d , 평균 %d %n",kor,eng,mat,sum);
		
		String num = "881120-1068234";
		
		System.out.println(num.substring(0,6) + "-" + num.substring((int) 7.12));
		
		
		String pin = "881120-1068234";
		
		char pin1 = pin.charAt(7); // 특정 문자열을 한개 가져올수 있다.
		System.out.println(pin1);
		
		String a = "a:b:c:d";
		
		System.out.println(a.replace(":", "#"));
		
//		List<Integer> myList = new ArrayList<>();
//		myList.sort(null);
		
//		ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life","is","too","short"));
//		System.out.println(myList.toString());
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 90);
		map.put("B", 80);
		map.put("C", 70);
		Integer op = map.remove("B");
		System.out.println(map.get("B"));
		
	}
}

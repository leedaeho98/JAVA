package chap_03;

public class page2문자열 {
public static void main(String[] args) {
	String s = "I like Java and Python and C.";
	
	// 문자열 변환
	System.out.println(s.replace("and",","));
	//s.replace("기존값","바꿀값") and를 ","로 변환
	
	System.out.println(s.substring(7));
	// 인덱스 기준 7부터 시작 (이전 내용은 삭제)
	
	System.out.println(s.substring(s.indexOf("Java")));
	// 위 결과랑 같음
	
	System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
	//시작 위치부터 끝 위치 "직전"
	//" Java "가 시작하는 위치부터 "."이 시작하는 위치 바로 앞까지
	
	// 공백 제거
	s = "      I love Java.           "; //인터넷에서 파일을 가져오면 대부분 이럼
	System.out.println(s);
	System.out.println(s.trim()); //앞 뒤 공백 제거
	
	//문자열 결합
	String s1 = "Java";
	String s2 = "Python";
	
	System.out.println(s1 + s2);
	
	System.out.println(s1 + "," + s2); //사이에 콤마
	System.out.println(s1.concat(", ").concat(s2));
	//문자열 결합문
			
}
}

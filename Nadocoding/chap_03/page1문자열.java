package chap_03;

public class page1문자열 {
public static void main(String[] args) {
	String s = "I like Java and Python and C.";
	
	//문자열의 길이
	System.out.println(s.length()); //length 문자열의 길이
	
	//대소문자 변환
	System.out.println(s.toUpperCase()); //대문자로
	System.out.println(s.toLowerCase()); //소문자로
	
	//포함 관계
	System.out.println(s.contains("Java")); //값 안에 포함되면 True
	System.out.println(s.contains("C#"));	//포함되지 않는다면 false
	
	System.out.println(s.indexOf("Java")); //값의 위치정보(앞에서부터 0시작)
	System.out.println(s.indexOf("C#")); //포함되지 않는다면 -1 출력
	//값의 인덱스는 0부터 시작(공백도 포함)
	
	System.out.println(s.indexOf("and")); //같은 값이 있으면 앞이 우선적으로 출력
	System.out.println(s.lastIndexOf("and")); //같은 값이 있는 경우 마지막으로 일치하는 값이 출력
	
	System.out.println(s.startsWith("I like")); //이 문자열로 시작하면 True
	System.out.println(s.startsWith("You like")); //이 문자열로 시작하지 않으면 false;\
	
	System.out.println(s.endsWith(".")); //이 문자열로 끝나면 true / 아니면 false
}
}

package chap_03;

public class page6연습 {
public static void main(String[] args) {
	String s = "Hi Everyday Good Morning";
	String d = "                 Hi             ";
	
		System.out.println(s.length()); // 문자열의 길이
		System.out.println(d.length()); // 문자열의 길이
		
		System.out.println(s.substring(0,11)); // ("시작점,값 직전까지")
		System.out.println(s.substring(0,(s.indexOf("G")+4)));//인덱스 번호 0부터 G의 인덱스 번호 +4
		
		System.out.println(s.toUpperCase()); //대문자로 변환
		System.out.println(s.toLowerCase()); //소문자로 변환
		
		System.out.println(d.trim()); // 좌우공백 제거
		
		System.out.println(s.contains("day")); //값 안에 day가 있으면 true
		System.out.println(d.contains("party")); // 없으면 false
		
		System.out.println(s.startsWith("Hi")); //첫 문장이 "값" 동일하면 true
		System.out.println(s.endsWith("pass")); //마지막 문장이 "값" 불일치하면 false
		
		String max = s == d || 10 < 5 ? "똑같아요" : "달라요"; //삼항연산자
		System.out.println(max);
		
}
}

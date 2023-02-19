package chap_03;

public class page5퀴즈 {
public static void main(String[] args) {
	String p = "저는 배고픕니다 라고 말하자 대호는 \'밥을 사주겠다\'라고 말하였다 ";
		System.out.println(p.length()); //문자열의 길이를 알수있다
		System.out.println(p.substring(20,29));
		// 인덱스시작점 20부터 마지막 29 직전까지!
		System.out.println(p.substring(20,(p.lastIndexOf("라"))));
		// 인덱스 시작점 20(인덱스번호) 마지막 인덱스 "라"에서 직전까지
		
		System.out.println(p.substring(20,(p.indexOf("다") +22)));
		// 인덱스 시작점 20(인덱스번호) 첫 인덱스 "다"에서 +22 이동 후 직전까지
		
		System.out.println(p.substring(20,(p.lastIndexOf("다") -6)));
		// 인덱스 시작점 20(인덱스번호) 마지막 인덱스 "다"에서 직전까지 -6
	String j="I love Han-hea-min";	
	p="Void Man Last Year";
		System.out.println(p);
		System.out.println(p.toUpperCase()); //값을 대문자로 변환
		System.out.println(p.toLowerCase()); //값을 소문자로 변환
		
		System.out.println(j +"," + p); //문자열 합체
		
		System.out.println(p.indexOf("a")); //값의 위치정보 앞에서부터 0으로 시작
		System.out.println(p.substring(1,5)); // substring(시작점 , 값 직전까지)
		
		System.out.println(p.replace("Man","Woman")); //replace("기존값" , "변경할값")
		
	String l = "            pass of master              ";
		System.out.println(l.trim()); //좌우 공백 제거
		
		System.out.println(l.contains("pass")); // 값 안에 pass가 포함되면 true
		
		
		System.out.println(l.startsWith(" ")); //값 첫 문장이 "값" 맞으면 true
		System.out.println(l.endsWith("master")); //값 마지막 문장이 "값" 틀리면 false
		
	}
}
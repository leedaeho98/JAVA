package java_23_03_12;

public class CardIvCv {
	/*
	1. 클래스 변수와 인스턴스 변수 차이
		예) 포커카드
		인스턴스변수 => 카드의 무늬 , 숫자는 달라야하기에 => 개별속성
		static(클래스)변수 => 카드의 폭 , 높이는 같아야하기에 => 공통속성
	 */
	// 개별속성(인스턴스변수)
	String kind; // 무늬
	int number; // 숫자
	
	// 공통속성(클래스변수)
	static int weight= 250;
	static int height= 300;
	
	public static void main(String[] args) {
		CardIvCv v1 = new CardIvCv(); // CardIvCv타입의 변수는 v1 객체 생성했으므로 인스턴스 변수 생성
		CardIvCv v2= new CardIvCv(); // CardIvCv타입의 변수는 v2 객체 생성했으므로 인스턴스 변수 생성
		v1.kind = "하트"; // 인스턴스 변수는 변수 v를 이용해 값 생성
		v1.number = 7;
		
		v2.kind = "스페이드";
		v2.number = 4;
		
		CardIvCv.weight = 250; // 클래스명을 사용해 값 생성
		CardIvCv.height = 300; // 좋은코드 X
		
		System.out.printf("카드는 %s 숫자는 %d 높이는 %d 넓이는 %d이다",v1.kind, v1.number, CardIvCv.weight, CardIvCv.height);
		
		
	}

}

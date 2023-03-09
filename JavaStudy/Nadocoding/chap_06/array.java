package chap_06;

public class array {
public static void main(String[] args) {
	//배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
//	String coffeeRoss = "아메리카노";
//	String coffeeRachel = "카페모카";
//	String coffeeMonica = "카푸치노";
//
//	System.out.println(coffeeRoss + "하나");
//	System.out.println(coffeeRachel + "하나");
//	System.out.println(coffeeMonica + "하나");
//	System.out.println("주세여");
	
	// 배열 선언 첫 번쨰 방법
//	String[] coffees = new String[4]; //크기 4개의 스트링 배열을 만듬
	
	// 두 번째 방법
////	String coffees[] = new String[4]
//	coffees[0] ="아메리카노"; //[]괄호 안은 인덱스 값으로 0부터 시작 
//	coffees[1] = "카페모카";
//	coffees[2] = "라떼";
//	coffees[3] = "카푸치노";
	
	// 세 번째 방법
//	String[] coffees = new String[] {"아메리카노","카페모카","라떼","카푸치노"};
	//대괄호안에 크기를 명시하지 않는다
	
	// 네 번쨰 방법
//	String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
	
	//커피 주문
//	coffees[2] = "홍차라떼"; //인덱스 번호로 접근 및 변경가능
//	System.out.println(coffees[0] + "하나"); //내가 접근하고 싶은 인덱스 번호
//	System.out.println(coffees[1] + "하나");
//	System.out.println(coffees[2] + "하나");
//	System.out.println(coffees[3] + "하나");
//	System.out.println("주세요");
	
	
	//다른 자료형?
	double[] d = new double[] {10.0, 11.2, 13.5};
	boolean[] b = {true,true,false};
	System.out.println(d);
	System.out.println(b);
			}
}

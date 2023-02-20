package chap_04;

public class page2Else {
public static void main(String[] args) {
	//조건문 else문
	int hour = 10;
	if (hour > 14) {
		System.out.println("아이스 아메리카노 +1");
	} else { 
		System.out.println("디카페인 +1");
	//첫 문장이 거짓이면 else가 출력 됨
	}
	System.out.println("커피 주문 완료 #1");
	
	hour = 15;
	boolean morningCoffee = false;
	
	//오후 2시 이후이거나 모닝 커피를 마신 경우?
	if ( hour < 14 || morningCoffee == true ) {
		System.out.println("아이스 아메리카노 (디카페인) +1");
	
	} else { //그 외의 경우면
		System.out.println("아이스 아메리카노 +1");
	}
	System.out.println("커피 주문완료 #2");
  }
}

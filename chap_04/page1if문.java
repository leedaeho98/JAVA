package chap_04;

public class page1if문 {
public static void main(String[] args) {
	//조건문 If
	//if (조건문) {println("참일때 값"} {}중괄호는 if문의 범위를 말한다
	//if 문 내에서 하나의 문장을 실행할 {중괄호] 생략 가능
	int hour = 14;
	
	
	//if 문 내에서 2개 이상의 문장을 실행할 때는 {} 생략 불가
	if (hour < 14) {
	System.out.println("아이스 아메리카노 +1");
	System.out.println("샷 추가");
	System.out.println("주문 완료!");
	}
	//오후 2시 이전 , 모닝 커피를 마시지 않은 경우
	
	//&& 논리연산자 두 값이 동일해야 한다
	//값이 동일하지 않으므로 if문 앞에 있는 출력문은 실행 x
	hour = 13;
	boolean morningCoffee = false; //모닝커피
	//부정논리연산자를 false 에서 반대인 true가 됨으로 인해 출력
	if (hour < 14 && !morningCoffee) {
		System.out.println("아이스 아메리카노 +1");
	}
	System.out.println("커피 주문 완료#2");
	
	//오후 2시 이거나 모닝 커피를 마신 경우?
	hour = 10;
	morningCoffee = true;
	if (hour >= 14 || morningCoffee) {
		System.out.println("디카페인 +1");
	}
	System.out.println("커피 주문 완료#3");
		
	
	}
}

	

package java_23_03_14;

public class MethodReturn {
	/* return문
		=> 실행중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
	*/
	// 반환타입이 void인 경우 => return문 작성 안해도 됌
	void printGugudan(int dan) {
		int sum = 0;
		if (! (2 <= dan && dan <= 9 )) {
			return; // 입력받은 값(dan)이 2~9가 아니면 , 메서드 종료하고 메인으로 리턴
		}
		for(int i = 1 ; i < 10 ; i++) {
			sum = dan * i;
			System.out.printf("%d * %d = %d %n",dan,i,sum );
		}
	}
	
	// 반환타입이 void가 아닌 경우, 반드시 return문 필요
	
	int BigValue(int num1 , int num2) {
		int result = 0;
		result = num1 > num2 ? num1 : num2; 
		// 삼항연산자 변수 = 조건식 true : false 	
		return result; // 리턴할 값은 메서드 타입이랑 일치(자동형변환도 가능)
	}
	
	
	public static void main(String[] args) {
		MethodReturn mr = new MethodReturn(); // 클래스객체를 생성한다(안에 있는 인스턴스변수 및 메서드를 사용가능)
		mr.printGugudan(6);
		
		int result = mr.BigValue(3, 5);
		System.out.printf("가장 큰 값은 %d 입니다",result);
		

	}
}
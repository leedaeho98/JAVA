package chap_07;

public class overloading {
	// 메소드 오버로딩
	// 같은 이름의 메소드를 여러 번 선언
	// 1. 전달값의 타입이 다르거나
	// 2. 전달값의 갯수가 다르거나
	// 3. 반환형이 다른 형태로는  메소드를 중복 정의 불가능
	
	public static int getPower(int number) { //Parameter,  매개변수
		int result = number * number;
		return result;
	}
	
	public static int getPower(String strNumber) {
		int number = Integer.parseInt(strNumber); // 문자열인 형태를 정수형으로 변환
		return number * number;
		
	}
	public static double getPower(double douNumber) {
		double number = douNumber;
		return number * number;
	}
		
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent ; i++) {
			result *= number;
		}
		return result;
	}
	public static void main(String[] args) {
		//메소드 오버로딩 = 이름이 같은 함수더라도 자료형의 형태가 다르면 그 값에 맞춰서 출력
		System.out.println(getPower(3));	// 3 * 3 = 9
		System.out.println(getPower("4")); //문자열이지만 인티저로 형변환 시켰으므로 정수형 형태
		System.out.println(getPower(3.14));
		System.out.println(getPower(2,3));
	}

}

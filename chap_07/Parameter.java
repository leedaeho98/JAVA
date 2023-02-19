package chap_07;

public class Parameter {
	//전달값 , Parameter
	//전달값이 있는 메소드
	public static void power(int number) { //Parameter,  매개변수
		int result = number * number;
		System.out.println(number + " 의 2승은 " + result);
	}
	public static void powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent ; i++) {
			result *= number;
		}
		System.out.println(number + "의" + exponent + " 승은 " + result);
	}
	
	
	public static void main(String[] args) {
	// Argument , 인수	
	power(2); // 위에 정수형 변수를 정의햇으므로 전달하려는 값을 적는다	
	power(3); // 3 * 3 = 9
	powerByExp(2, 3); //위 함수로 값이 전달된다 그리고 출력
	powerByExp(3, 4);
	powerByExp(10, 0);
	
	}

}

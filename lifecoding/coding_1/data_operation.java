package coding_1;

public class data_operation {
	public static void main(String[] args) {
		
		// 프로그래밍에서는 데이터의 타입이 존재하고 데이터의 타입을 구별하는 이유는
		// 데이터에 타입별로 그 타입에 어울리는 연산방법이 있다 . 그래서 엄격하게 구분
		
		// 컴퓨터를 다루는 방법에 스킬은 쌓아가는것은 크게 2가지 흐름
		
		// 1.내가 지금 하고있는 시스템에는 어떤 종류의 데이터 타입이 존재하는가?
		// 2.각각의 데이터 타입 별로 어떤 연산방법들이 존재하는가?
		// 3.이것들을 통해서 컴퓨터로 할 수 있는 일이 폭발적으로 증가한다
		
		System.out.println(6); // Number
		System.out.println("six"); //문자열(String)
		System.out.println("6"); // String 6
		
		System.out.println(6+6); // 12 (숫자와 숫자가 연산)
		System.out.println("6" + "6"); //66 (문자열이 결합)
		
		System.out.println(6 * 6); //36
//		System.out.println("6" * "6"); //문자열의 타입은 곱하기 연산이 불가능
		
		System.out.println("1111".length()); //문자열의 길이를 알려주는 연산
//		System.out.println(1111.length()); // 불가능
	}
}

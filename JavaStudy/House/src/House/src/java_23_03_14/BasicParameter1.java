package java_23_03_14;
class Data1{int x;}

public class BasicParameter1 {
	/*
	 1. 기본형 매개변수 => 변수의 값을 읽기만 할 수 있다.(read only)
	 2. 참조형 매개변수 => 변수의 값을 읽고 변경할 수 있다.(read & write)
	 */
	// 참조형의 반환타입
	
	public static void main(String[] args) {
		Data1 d = new Data1();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		Data1 d2 = copy(d); // 값은 같지만 다른 주소를 가지고있다
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = " + d2.x);
		
	}
	static Data1 copy(Data1 d) { 
	// 매개변수에 10이 들어오지만 값을 재정의해서 1000으로 바뀜
	// static이므로 
		Data1 tmp = new Data1(); // 새로운 객체 tmp를 생성
		
		tmp.x = d.x; // d.x의 값을 tmp.x에 복사한다
		
		return tmp; // 복사한 객체의 주소를 반환한다
	}

}

package java_23_03_14;
class Data{int x;}


public class BasicParameter0 {
	/*
	 1. 기본형 매개변수 => 변수의 값을 읽기만 할 수 있다.(read only)
	 2. 참조형 매개변수 => 변수의 값을 읽고 변경할 수 있다.(read & write)
	 */
	// 참조형의 기본타입
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); // 메인에 이어서 change변수가 스택에 쌓이고 실행 후 소멸 => main실행
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}
	static void change(int x) { // 매개변수에 10이 들어오지만 값을 재정의해서 1000으로 바뀜
		x = 1000;
		System.out.println("change() : x = " + x);
		return;
	}
}

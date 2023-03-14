package java_23_03_14;
class Data2{int x;}

public class RefParam {
	/*
	 1. 기본형 매개변수 => 변수의 값을 읽기만 할 수 있다.(read only)
	 2. 참조형 매개변수 => 변수의 값을 읽고 변경할 수 있다.(read & write)
	 */
	// 기본형
	public static void main(String[] args) { // stack영역에 main이 쌓인다
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		// 메인메소드가 change를 호출
		// main메소드에서 change한테 참조형 매개변수를 줌으로써 객체의 주소를 전달
		// 그러므로 객체의 값을 다룰수 있다
		change(d); 
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) { // 참조형 매개변수을 받음으로써 메인 객체의 값을 읽거나 변경가능 
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}

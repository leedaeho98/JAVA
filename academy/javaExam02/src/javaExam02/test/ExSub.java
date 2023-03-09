package javaExam02.test;

public class ExSub extends ExSuper{ // ExSuper을 상속 => 단일상속만 가능
	// 오버라이딩 =>부모가 가진 메소드의 내용을 자식이 바꾼다
	// 오버로딩 =>같은 이름을 가진 메소드가 있더라도 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.
	public ExSub() {
		super(); // ExSuper() => 부모생성자를 호출
		// TODO Auto-generated constructor stub
	}
	
	public void prn() {
		System.out.println("영구없다");
	}


}

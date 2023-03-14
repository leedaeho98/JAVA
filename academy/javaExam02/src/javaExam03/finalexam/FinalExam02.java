package javaExam03.finalexam;

public class FinalExam02 {
	// final이 붙어있는 변수(필드, 지역변수) : 메모리에 만들어지는 시점에서 반드시 초기 값을 가져야한다. => 값 변경 불가능
	final int k; // 객체를 생성하는 시점에서 만들어지는 필드변수 =>생성되는 시점에서 초기화 되어야 한다
	final static double PI_VALUE=3.141592; // 로드 되는 시점에서 만들어지는 필드변수(static영역) => 상수변수 무조건 초가화 해야한다
	// 인터페이스에 프로젝트에 사용되는 모든 상수필드변수를 한 곳에 모아서 정의해주는것이 매우 매우 매우 매우 매우 좋다
	
	FinalExam02(){
		k = 300;
	}
	
	FinalExam02(int data){
		k = data;
	}
	
	public final int rtnValue() { // 상속하는 클래스에서 이 메소드를 오버라이딩 할 수 없다
		return k * 30;
	}
	public void testMe(int kkk) { // 
		int jjj; // 지역변수에 해당하는 파이널은 무시해두 된다
	}
}

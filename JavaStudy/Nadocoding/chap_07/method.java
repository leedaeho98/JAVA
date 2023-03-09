package chap_07;

public class method {
	// 메소드 = 함수
	//메소드 정의 = 메소드의 이름 앞부분은 일반적으로 동사를 쓴다
	public static void sayHello() {
		System.out.println("안녕하세요? 메소드입니다");
	}	
	public static void main(String[] args) {
		//메소드 호출
		System.out.println("메소드 호출 전");
		sayHello(); //위에 정의된 문장이 메인에서 호출을 통해서 출력된다
		sayHello(); //위에 정의된 문장이 메인에서 호출을 통해서 출력된다
		sayHello(); //위에 정의된 문장이 메인에서 호출을 통해서 출력된다
		System.out.println("메소드 호출 후");
	}

}


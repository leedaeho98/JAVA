package java_23_03_12;

public class Object_TvUse {
	public static void main(String[] args) {
		// Object_UseTv 클래스 객체 생성
		// t 참조변수
		Object_Tv t1 = new Object_Tv(); 
		
		t1.channel = 7; // TV에 있는 변수 사용
		t1.channelDown(); // TV에 있는 메소드 호출
		System.out.printf("t1의 값 : %d %n",t1.channel); // 호추
		
	// 위 아래는 각기 다른 주소값을 가지고있다 (t1 t2는 각기 다른 공간) 
		
		Object_Tv t2 = new Object_Tv();
		System.out.printf("t2의 값 : %d %n",t2.channel ); // 호추
		
		// 위 아래처럼 하나의 인스턴스를 여러 개의 참조변수가 가리키는 경우 (가능)
		// 여러 인스턴스를 하나의 참조변수가 가리키는 경우(불가능)
		
		t2 = t1; // t1의 주소값을 t2에 넣으면 t2의 주소값은 t1의 주소값이 된다
				// t2의 객체는 자동으로 삭제된다
		System.out.printf("t1의 주소 값을 가진 t2 : %d",t2.channel);
	}
	
}
// 객체의 생성과 사용
// 참조변수 => 주소값을 저장하는 공간 (stack) => 주소값 안에 데이터타입(heap)
//  . 클래스 작성(설계도) => 객체생성(제품)=> 객체(제품)사용
// 1. 객체의 생성
// Tv t; // Tv클래스 타입의 참조변수 t(리모콘)를 선언
// t = new Tv(); // Tv인스턴스를 생성한 후 , 생성된 Tv인스턴스의 주소를 t에 저장

// 2. 객체의 사용
// t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
// t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출.


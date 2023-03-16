package java_23_03_16;

class MyMath2{
	// 인스턴스 변수
	long a, b; // this.a this.b 생략된거다
	
	// 생성자
	MyMath2 (int a, int b){
		this.a = a; // this가 붙은건 인스턴스변수 , a는 생성자매개변수
		this.b = b;
	}
	// 인스턴스 메소드
	long add() {
		return a+b; // this 생략
	}
	
	// 클래스 메서드
	static long add(long a , long b) {
		return a+b; // 클래스 변수
	}
	
}





public class ValThis_This {

}

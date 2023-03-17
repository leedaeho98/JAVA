package java_23_03_16;

public class StatInst {
	void isntMethod() {} // 인스턴스메서드
	static void statMethod() {} // static메소드
	
	
	void isntMethod2() {
		isntMethod(); // 인스턴스메소드 사용가능
		statMethod(); // static메소드 사용가능
		
	}
	static void statMethod2() {
		// static메소드 안이므로 인스턴스 메소드는 객체 생성후 사용가능
		StatInst in = new StatInst(); 
		
		in.isntMethod2();
		statMethod();
	}
}

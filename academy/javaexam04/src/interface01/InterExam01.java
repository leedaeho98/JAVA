package interface01;

public interface InterExam01 {
	// 인터페이스의 모든 멤버는 public이다.
	// 인터페이스의 모든 필드는 static final이다.
	double PI = 3.14; // public static final double PI = 3.14
	// 인터페이스의 모든 메서드는 abstract이다.
	void calcu(); // public abstract void calcu()
}

// 의미론적인 인터페이스 => 내용물이 아무것도 없는 인터페이스(ex : Serialize..)
// 함수형 인터페이스(@FunctionalInterface => 메서드가 한 개만 존재하는 인터페이스 => 화살표함수로 구현)

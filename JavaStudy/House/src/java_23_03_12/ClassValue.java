package java_23_03_12;

public class ClassValue { // => 클래스 시작
		// 1. 선언위치에 따른 변수의 종류
		// 1-1. 클래스 영역
		// 객체 = iv(인스턴스변수)를 묶어놓은것
		int iv; // 인스턴스 변수 
		static int cv; // 클래스변수(static변수 = static + iv, 공유변수)
		
		/* 인스턴스변수와 static(클래스)변수의 생성시기
		인스턴스 변수는 객체를 생성해야만 사용이 가능
		클래스변수는 메모리(객체 생성없이 사용가능)에 올라가면 바로 사용가능하다
		*/
		
		
		// 메서드 영역
		void method() 
		{ // => 메소드 시작
			int lv = 0; 
			// 지역변수 => 메소드를 빠져나가면 없어짐
		} // => 메소드 끝
		
		public static void main(String[] args) {
			ClassValue cls = new ClassValue(); // ClassVAlue 객체생성
			cls.iv = 5;
			cv = 5; // static(클래스)변수
			
			System.out.printf("인스턴스 변수 cls의 값은 : %d %n",cls.iv);
			System.out.printf("static(클래스)변수 cv의 값은 : %d",cv);
		}
	} // => 클래스 끝

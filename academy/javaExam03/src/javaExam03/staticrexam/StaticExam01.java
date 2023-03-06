package javaExam03.staticrexam;

public class StaticExam01 { // 클래스=> 외부클래스 => static 사용불가
	// 필드는 메모리에 생성되는 순간 초기값을 갖는다
	public static int var1; // 정적필드 => 객체 생성 없이 바로 사용가능  => 초기값을 가지고 있고 만들어지는 위치가 static(?)영역
	// static : 응용프로그램이 실행되기 전에 먼저 메모리에 생성이 된다	
	public int var2;
	
	public static int method1() { // 정적메소드
		
		int rtnValue = 0;
		System.out.println("영구 없다");
		return rtnValue;
	}
	
	public int insMethod01() { // 인스턴스 메소드 => 객체생성이 되어야만이 사용할 수 있는 메소드
			return 100;
	}

	 public static class innerC{ // 중첩클래스(내부클래스, 멤버 정적 클래스) => static 사용가능 
		public static String irum="이영구";
		
	}
}
	 


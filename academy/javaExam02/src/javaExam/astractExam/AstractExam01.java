package javaExam.astractExam;

public abstract class AstractExam01 { // abstract => 추상 클래스 => 상속을 강제한다.
	public void pt() { // 일반적인 인스턴스메소드다
		System.out.println("영구 없다");
	}
	
	public abstract double calcu(double d1, double d2);
	// 추상클래스는 일반 메소드들로 구성될수도 있지만 추상 메소드를 하나라도 포함하고 있으면
	// 추상클래스가 되어야한다
}

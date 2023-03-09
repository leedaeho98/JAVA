package javaExam.astractExam02;

public class WorkMain {
	public static void main(String[] args) {
		// 홍길동에게 삼각형(TriCalcu)의 면적을 구하는 프로그램을 지시
		// 홍길순한테 사각형(RecCalcu)의 면적을 구하는 프로그램을 지시
		// 나일동에게 원(CorCalcu의 면적을 구하는 프로그램을 지시
		
		Calcu obj = new TriCalcu();
		System.out.println("삼각형의 면적 : " + obj.area(30, 15.8));
		System.out.println("========================");
		
		obj = new RecCalcu();
		System.out.println("사각형의 면적 : " + obj.area(76, 628));
		System.out.println("=========================");
		
		obj = new CirCalcu();
		System.out.println("원의 면적 : " + obj.area(70, 70));
		System.out.println("=========================");
		
	}
}

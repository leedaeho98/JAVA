package javaExam03.staticrexam;

public class UseExam {
	public static void main(String[] args) {
		
		
		System.out.println(StaticExam01.var1);
		System.out.println(StaticExam01.method1());
		
		
		StaticExam01 obj =new StaticExam01(); 
		
		System.out.println(obj.var2);
		obj.insMethod01();
		
		
		// 내부 클래스를 출력할 때
		System.out.println(StaticExam01.innerC.irum);
	}
}

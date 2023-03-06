package javaExam.astractExam;

public class UseAstractExam {
	public static void main(String[] args) {
		calResultPrn(new RecCalcu());
		
		calResultPrn(new TriCalcu());
	}
	
	public static void calResultPrn(AstractExam01 obj) {
		System.out.println(obj.calcu(50, 10));
	}
	
}

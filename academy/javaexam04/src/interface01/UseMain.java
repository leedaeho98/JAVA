package interface01;

public class UseMain {
	public static void main(String[] args) {
//		InterExam01 obj = new SubInterAddSubtractImpl();
//		obj.calcu();
		/* Bestg */
//		InterExam01 bestobj = ObjectCreateFactory.createObjText();
//		bestobj.calcu();
		
		InterStdExam exam = ObjectCreateFactory.createObjStd();
		int result = exam.test(30, 20);
		System.out.println("연산 결과 : " + result);
		
	}
}

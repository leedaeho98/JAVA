package interface01;

public class InterStdImpl01 implements InterStdExam {

	@Override
	public int test(int data1, int data2) {
		System.out.println("두 개의 정수를 받아서 덧셈한 후 반환");
		return data1 + data2;
	}
	
	
}

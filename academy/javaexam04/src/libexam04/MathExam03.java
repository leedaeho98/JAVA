package libexam04;

public class MathExam03 {
	
	public static void main(String[] args) {
		System.out.println(Math.sqrt(4)); // 루트
		System.out.println(Math.pow(4, 0.5));
		System.out.println(Math.pow(8, 1/3.0));
		
		for (int i = 100; i < 201; i++) {
			if ( (i&1) == 1) { // 홀수 구하는 방법 => 속도가 빠르다
				System.out.println(i);
			}
		}
	}
}

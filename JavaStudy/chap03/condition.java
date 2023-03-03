package chap03;

public class condition {
	public static void main(String[] args) {
		// 삼항 연산자 변수 = (조건식) ? x : y ; //참이면 x 변수에 대입 거짓이면 y 변수에 대입
		int x = 10;
		int y = 20;
		int result=0;
		
		result = (x>y) ? x:y ; // 참이면 x값 result에 대입 거짓이면 y값 result에 대입
		System.out.println(result);
		
		// 대입 연산자 => 오른쪽 피연산자를 왼쪽 피연산자에 저장 후 저장된 값을 반환
		//연산결합법칙 => 오른쪽에서 왼쪽으로 이동
		int a = 3; // 3을 a에 대입
		System.out.println(a);
		
		
		
	}
}

package chap03;

import java.util.*;

public class Operator {
	public static void main(String[] args) {
//		// 1. 연산자 = 모든 연산자는 연산결과를 반환한다
//		
//		// 연산자 : 연산을 수행하는 기호 (+ , - , * , /)
//		// 피연산자 : 연산자의 연산 수행 대상 (숫자)
//		Scanner scanner = new Scanner(System.in); // 객체 생성
//		
//		System.out.print("x의 값을 입력하세요 : "); 
//		int x = scanner.nextInt(); // 정수형으로 입력
//		int y = 4 * x + 3;
//		
//		System.out.println(y);
		
		// 2. 연산자의 우선순위 = 하나의 식에 연산자가 둘 이상 있을때, 어떤 연산을 먼저 수행할지를 자동 결정
		System.out.println((5+3)*10); // 곱셈 우선순위 , 순위를 정할거면 괄호()
		
		
		// 3. 연산자의 결합규칙
		//  산술연산자 (단항(1) > 이항(2) > 삼항(3)) > 비교연산자 > 논리연산자 > 대입연산자 
		// 대입과 단항 연산자(오른쪽에서 왼쪽)를 제외하면, 모두 왼쪽에서 오른쪽
		
	}
}

package chap03;

import chap02.char_str;

public class logic {
	public static void main(String[] args) {
		//논리 연산자 && ||
		// || (OR결합) => 피연산자중 어느 한 쪽이 true이면 true를 결과로 얻는다
		// && (AND결합) => 피연산자 양쪽 모두 true이어야 true를 결과로 얻는다.
		
		int x = 10;
		int i = 10;
		char ch= 'a';
		
		System.out.println(x > 20 || x < 20); // 한쪽만 true면 true
		System.out.println(x < 20 && x > 20); // 양쪽 모두 trueㅇ야 true
		
		System.out.println(i%2 == 0 || i%3 ==0); 
		// i는 2의 배수 또는 3의 배수다
		// 나머지가 0이 남으면 참(true) 아니면 거짓(false) 
		
		System.out.println((i%2 ==0 || i%3 ==0) && i%6!=0);
		// 괄호를 먼저 쳐서 어디를 먼저 계산할지 정한다
		//i는 2의 배수 또는 3의 배수지만 6의 배수는 아니다
		
		System.out.println(i % 2 ==0 || i%3 ==0 && i%6!=0);
		//"&&"가 "||"보다 우선순위가 높기 때문이다. 만일 괄호를 사용하지 않으면 "&&"를 먼저 연산한다
		
		System.out.println('0' <= ch && ch <= '9'); // 두 피연산자를 만족하기 때문에 참
		
		// 문자 ch는 대문자 또는 소문자이다
		// ch가 대문자인지 소문자인지 확인하는 식
		System.out.println(('a' <= ch && ch <= 'z')||('A' <= ch && ch <= 'Z'));
		
		//논리 부정 연산자 !(단항연산자) => true를 false로 false를 true로
		boolean b = true;
		System.out.println(!!b);
		
	}
}

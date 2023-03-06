package chap04;

public class if_else {
	public static void main(String[] args) {
		int score = 50;
		// 조건문과 반복문 => 제어문
		// 조건문 = 조건을 만족할때만 {}를 수행(0~1번) => if, switch
		// 반복문 = 조건을 만족하는 동안{}를 수행(0~n번) => for, while
		
		//조건식 : 조건식이 참일 조건 (중요)
		// 90 <= x && x <= 100 : 정수 x가 90이상 100이하일 때
		// x < 0 || x > 100 : 정수 x가 0보다 작거나 100보다 클 때
		// x%3==0 && x%2 !=0 : x는 3의 배수지만 2의 배수는 아닐 때
		// ch == 'y' || ch == 'Y' : 문자 ch가 'y' 또는 'Y'일 때
		// ch == ' ' || ch == '\t' || ch== '\n' : 문자 ch가 공백이거나 탭 또는 개행 문자일 때
		// 'A' <= ch && ch <= 'Z' : 문자 ch가 대문자일 때
		// 'a' <= ch && ch <= 'z' : 문자 ch가 소문자일 때
		// '0' <= ch && ch <= '9' : 문자 ch가 숫자일 때
		// str.equals("yes") : 문자열 str의 내용이 yes일 때(대소문자 구분 , 대문자면 false)
		// str.equalsIgnoreCase("yes") // 문자열 str의 내용이 "yes"일 때 (대소문자 구분안함)
		
	if (score > 60) 
	{
		System.out.println("합격입니다"); // if문에 속한 문장
	} else {
		System.out.println("탈락입니다");
	}
	System.out.println("축하드려요"); // if문에 속한 문장이 아님
}
}
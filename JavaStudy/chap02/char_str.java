package chap02;

import java.awt.desktop.AboutHandler;

public class char_str {
	public static void main(String[] args) {
		//문자와 문자열
//		char ch = 'AB'; // 에러
//		char ch = ''; //에러
		
		char ch = 'A';
		int i = 'A';
		System.out.println("문자 : " + ch);
		System.out.println("int형 'A' : " + i);
		//'A'는 정수형 아스키코드 65이다
		String a = "A";
		String b = ""; //공백가능 하지만 char 타입은 공백 불가능
		System.out.println("문자열 : " + a);
		System.out.println("문자열 : " + b);
		
		//연속된 문자열 결합
		//문자열 + and type = 문자열
		//and type + 문자열 = 문자열
		String c = "" + 7 + 7; 
		//문자열의 결합 순서는 왼쪽부터 오른쪽 방향이다
		//""+7 = "7" 문자열 7로 변형한다
		// "7" + 7 = 문자열 "77" 이 된다
		String d = 8+8+"";
		//8+8이 16이 된 후에 문자열 결합
		System.out.println("문자열의 결합 : "+ c);
		System.out.println("문자열의 결합 : "+ d);
		
		
	}
}

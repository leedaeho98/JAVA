package chap02;

import java.sql.Date;

public class Value_type {
	public static void main(String[] args) {
		// 기본형과 값의 타입(기본형 8개)
		
		// 자료형 : 범위 : byte
		// 문자 = char : '\u0000 ~ '\uffff' (0~2ⁿ(16)-1 ,0~65535) : 2byte  
		
		// 정수 = byte :  -128 ~ 127 (-2ⁿ(7) ~ 2ⁿ(7)-1 : 1byte
		// 정수 = short :  -32768 ~ 32767 (-2ⁿ(15) ~ 2ⁿ(15)-1 : 2byte 
		// 정수 = int :  약 +-20억 (-2ⁿ(31) ~ 2ⁿ(31)-1) : 4byte
		// 정수 = long : 약 +-90억 (-2ⁿ(63) ~ 2ⁿ(63)-1) : 8byte
		
		// 실수의 정밀도 = float(소수점기준 7자리) , double(소수점기준 15자리)
		// 실수 = float :  1.4E-45 ~ 3.4E38 (1.4*10ⁿ(-45) ~ 3.4 * 10ⁿ(38) : 4byte 
		// 실수 = double :  4.9E-324 ~ 1.8E308 (4.9*10ⁿ(-324) ~ 1.8*10ⁿ(308) : 8byte 

		// 논리 = boolean : false, true : 1byte
		
		// 기본형의 특징 : 실제 값을 저장
		
		// 참조형
		// 기본형을 제외한 나머지 (String, System 등)
		// 메모리 주소를 저장(4 byte 또는 8 byte)
		// 4byte = 32bit JVM(자바버츄얼머신) 40억 메모리 사용가능
		// 8byte = 64bit JVM(자바버츄얼머신) 40억*40억 (테라바이트 단위로 사용가능)
		
		
		//참조형 변수 =  객체의 주소를 저장하기 위한 것이다
//		Date today; //참조형 변수(Date) today를 선언
//		today=new Date(400); // today에 객체의 주소를 저장
//		System.out.println(today);
		
	}
}

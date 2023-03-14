package java_23_03_12;

// 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직 (중요)
public class Object_oriented01 {} // 소스파일의 이름은 public class이름과 일치
	class Object_oriented02{
		public static void main(String[] args) {
			System.out.println("hello");
		}
	
/* 1. 객체지향 언어
	 1-1. 객체지향의 장점
		 . 코드의 재사용성이 높고 유지보수가 용이,중복 코드 제거
		 . 객체지향 언어 = 프로그래밍 언어 + 객체지향개념(규칙)
		   	   
	 1-2. 객체지향의 4대핵심개념
		 . 캡슐화
		 . 상속
		 . 추상화
		 . 다형성
		     
	 1-3. 객체지향 개념은 어떻게 공부해야 하나요?
	 	 . 자바책 6장 7장(다형성) 반복공부 후 => 추상화 인터페이스 해야 이해가 간다
	 	 . 객체지향 언어(설계) = 프로그래밍언어 + 객체지향개념(규칙) => 규칙을 외워야한다
		*/
		/*
	2. 클래스
		 . 클래스의 정의 => 클래스란 객체를 정의해 놓은 것
		 . 클래스의 용도 => 클래스는 객체를 생성하는데 사용
		
	2-1. 객체
		 . 객체의 정의 => 실제로 존재하는 것. 사물 또는 개념
		 . 객체의 용도 => 객체가 가지고 있는 기능과 속성에 따라 다름
		
	ex)
		. 클래스 : 객체
		. 제품설계도 : 제품
		. TV설계도 : TV
		. 붕어빵 기계 : 붕어빵
		
	3. 객체의 구성요소 => 속성(변수) + 기능(메서드)
	.객체와 인스턴스
		. 객체 : 모든 인스턴스를 대표하는 일방적인 용어
		. 인스턴스 : 특정 클래스로부터 생성된 객체(예:Tv인스턴스)
		 	 
	 ex)
		 					3-0. 클래스
		 TV속성(변수)				:			기능(메서드)
		 Class Tv{				:		void power() {power = !power;}
		 String color; // 색깔	:		void channelUp() {channel++;}
		 boolean power // 전원상태	:		void channelDown() {channel--;}
		 int channel;  // 채널 	:
		 
		
		 					3-1. 인스턴스(객체)
		color() => null
		power() => false
		channe1Up(), channelDown() => 0

	4. 클래스(설계도)가 왜 필요한가? => 객체(제품(TV))를 생성하기 위해
		=> 객체(제품(TV))가 왜 필요한가? 객체(제품(TV))를 사용하기 위해
		=> 객체(TV)를 사용한다는 것은? => 객체(TV)가 가진 속성과 기능을 사용하려고
	
	5. Hello2.java (자바파일) => 
		. public 클래스가 있는경우 => 소스파일의 이름은 반드시 public class의 이름과 일치
		=> public class Hello2{} => 대소문자 구분
		=>		  class Hello3{}
		
		. public 클래스가 하나도 없는경우 => 소스파일의 이름은 'Hello2.java' , 'Hello3.java' 둘 다 가능
		=> class Hello2{}
		=> class Hello3{}
		 */
		
	
	}



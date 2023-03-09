package chap02;

public class prefix {

	public static void main(String[] args) {
	//리터럴의 접두사와 접미사
	// 종류 : 리터럴 : 접미사(대소문자 구별안함)
		
	System.out.println("==== 논리 : 리터럴 : 접미사 ====");
		
	// 논리형 : false, true : 없음
	boolean power1 = true; 
	boolean power2 = false;
	System.out.println("자료의 타입 boolean형 : " + power1);
	System.out.println("자료의 타입 boolean형 : " + power2);
		
	// 정수형 : 123, 100L , 0b0101 : L(long 변수타입 쓸때만 적용)
	int num1 = 5;
	long num2 = 300_0000_0000_00L; // 접미사 L
	//int형의 값의 범위를 넘길경우 접미사 L 사용 ( int형을 안넘으면 생략 가능)
		
	System.out.println("자료의 타입 int형 : " + num1);
	System.out.println("자료의 타입 long형 : " + num2);
		
		
		
		// 실수형 : 3.14 , 3.08e , 1.4f : f,d(double타입은 생략 가능)
	float f = 3.14F; // F(접미사에 대소문자 구별 안함)
	double d1 = 3.1456789123;
	double d2 = 1e3; 
	//기호 e는 실수형에 사용한다
	// 기호 e는 10의 n제곱을 의미
		
	System.out.println("자료의 타입 float형 : " + f);
	System.out.println("자료의 타입 double형 : " + d1);
	System.out.println("자료의 타입 double형 : " +d2);
		
		
		
	// 문자형 : 'A' ,'1' , '\n' : 없음
	char ch = 'a';
	System.out.println("자료의 타입 char형 : " + ch);
		
	// 문자열 : "ABC" , "123" , "A" , "True" : 없음
	String str = "ABC";
	System.out.println("자료의 타입 String형 : " + str);
	//변수와 리터럴의 타입 불일치
		
	System.out.println("==== 변수와 리터럴 타입의 불일치 ====");
	
	//1. 범위가 변수(그릇) > 리터럴(물건) 인 경우
	int a = 'A'; // int(4바이트) > char(1바이트)
	long b = 123; // long(4바이트 범위가 넓음) > int(4바이트)
	double d = 3.14f; // double(8바이트) > float(4바이트)
	
	System.out.println("범위가 int > 'A'인 경우 : " + a);
	System.out.println("범위가 long > 123인 경우 : " + b);
	System.out.println("범위가 double > 3.14f인 경우 : " + d);	
	
	
	//2. 범위가 변수(그릇) < 리터럴(물건) 인 경우 , 에러
//	int c = 30_0000_0000; // int의 범위(+-20억) 벗어남
//	long l = 3.14f; // long < float
//	float f = 3.14; // float < double
	
	System.out.println("byte, short 변수에 int리터럴 저장가능");
	//3. byte , short 변수에 int리터럴 저장가능
	//단, 변수의 타입의 범위 이내이어야 함
	byte g = 100; // byte의 범위(-128~127)에 속함
//	byte h = 128; // byte의 범위를 벗어남
	
	// 접두사
	int i = 100; // 10진수
	int oct = 0100; // 접두사 0 (8진수)
	int oct2 = 010; //8진수, 10진수로 8
	int hex = 0x100; // 접두사 0x (16진수)
	int hex2 = 0x10; //16진수 , 10진수로 16
	int k = 0b100; // 접두사 0b ( 2진수)
	System.out.println("10진수 : " + i);
	System.out.println("8진수에서, 10진수로  : " + oct);
	System.out.println("8진수, 10진수로  " + oct2);
	System.out.println("16진수, 10진수로: " + hex);
	System.out.println("16진수, 10진수로  : " + hex2);
	System.out.println("2진수에서, 10진수로 : " + k);
	
	//정수 실수형 값 범위 
	long p = 10_000_000_000L; //long 변수 타입을 쓸 경우 int 범위(+-20억)을 넘어서면 L을 붙인다
	
	float y = 3.14f;
	double z = 3.14f; //double의 타입의 바이트가 더 크다
	System.out.println(p);
	System.out.println(y);
	System.out.println(z);
	System.out.println(10.0);
	System.out.println(0.10);
	System.out.println(1e3);
	
	
	}

}

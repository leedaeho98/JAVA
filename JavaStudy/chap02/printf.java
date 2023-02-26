package chap02;

public class printf {
	public static void main(String[] args) {
//		// println()의 단점 - 출력형식 지정불가
//		// 1. 실수의 자리수 조절불가 - 소수점 n자리만 출력하려면?
		System.out.println(10.0 / 3); // 3.3333333
		
		// 2. 10진수로만 출력된다 - 8진수, 16진수로 출력하려면?
		System.out.println(0x1A); // 26(10진수)
//		
//		// printf()의 지시자
//		
//		// %d = 10진(decimal)정수의 형식으로 출력 // 정수
//		// %o = 8진(octal)정수의 형식으로 출력 // 정수
//		// %x,%X = 16진(hexa-decimal)정수의 형식으로 출력 // 정수
//		// %f = 부동 소수점(floating-point)실수의 형식으로 출력 // 실수
//		// %e,%E = 지수(exponent)실수의 형식으로 출력 // 실수
//		// %c = 문자(character) 형식으로 출력 // 문자
//		// %s = 문자열(String) 형식으로 출력 // 문자열
//		// %b = 불리언(boolean) 형식으로 출력 // true,false
//		
//		
		System.out.println("==== printf()지정자 1/3 ====");
		//prinf()로 출력형식 지정가능
//		// printf()는 줄바꿈을 하지 않으므로 개행문자 %n으로 줄바꿈을 한다
		System.out.printf("%.2f%n", 10.0 / 3); // 소수점 둘째자리
		System.out.printf("안녕하세요 이름은 %s 이고 나이는 %d 직업은 %s 입니다 %n","이대호",26,"개발자");
//		
//		// 1. 정수를 10진수 , 8진수 ,16진수로 출력
		System.out.println("==== printf()지정자 2/3 ====");
		System.out.printf("%d %n", 15); // 10진수
		System.out.printf("%o %n", 15); // 8진수
		System.out.printf("%x %n", 15); // 16진수
		System.out.printf("%s" , Integer.toBinaryString(15)); // 1111 2진수
		
//		// 2. 8진수와 16진수 접두사 붙이기
		System.out.printf("%#o %n" , 15); // 8진수
		System.out.printf("%#x %n" , 15); // 16진수
		System.out.printf("%#X %n" , 15); // 16진수 대문자
		
//		// 3. 실수 출력을 위한 지시자 %f - 지수형식 %e, 간략한 형식 %g
		float f = 123.4567890f;
		System.out.printf("%f %n" , f); // 정밀도 7자리 직전까지 (7자리부턴 의미없는 수 생성)
		System.out.printf("%e %n" , f); // 지수형식으로 출력 (실제로 저장된 값은 같으나 마지막 값은 반올림 출력)		
		System.out.printf("%g %n", f); // float 타입은 정밀도 7자리 직전에서 반올림
		System.out.printf("%g" , 0.00000001);
		
		
		System.out.println("==== printf()지정자 3/3 ====");
		int num1 =10;
		double num2 = 1.23456789;
		// 정수
		System.out.printf("[%5d] %n",num1); // 오른쪽 정렬
		System.out.printf("[%-5d] %n",num1); // 왼쪽 정렬
		System.out.printf("[%05d] %n",num1); // 5칸중에 10을 제외 3칸을 0으로 채운다
		
		// 실수
		System.out.printf("[%14.10f] %n" , num2); // 오른쪽 정렬 10칸 띄우고 10번째 자리까지 출력
		System.out.printf("[%-14.4f] %n" , num2); // 왼쪽 정렬 10칸 띄우고 4번째 자리까지 출력
		
		// 문자열
		System.out.printf("[%15s] %n", "www.naver.com"); // 오른쪽 정렬 
		System.out.printf("[%-15s] %n", "www.naver.com"); // 왼쪽 정렬 -
		System.out.printf("[%.3s] %n", "www.naver.com"); // 부분출력
		
		
		

		}
	}
		

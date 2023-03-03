package chap03;

import chap02.char_str;

public class Operator2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		System.out.printf("%d + %d = %d %n",a,b,a+b);
		System.out.printf("%d - %d = %d %n",a,b,a-b);
		System.out.printf("%d * %d = %d %n",a,b,a*b);
		System.out.printf("%d / %d = %d %n",a,b,a/b); // 값 손실
		
		// 정수형을 실수형으로 형변환 => float의 범위가 더 크므로 형변환 가능
		System.out.printf("%.1f / %d = %.1f %n",(float)a, b, (float)a / b);
		
		// 1. 산술 변환 => 연산 전에 피연산자의 타입을 일치시키는 것
		// 1-1 . 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)
		// 예 ) long(8byte) + int(4byte) => long + long = long
		//      float(int형보다 범위가 높다) + int => float + float => float
		//		doulbe(8byte) + float(4byte) => double + double => double
		
		// 1-2. 피연산자의 타입이 int보다 작은 타입이면 int(4byte)로 변환한다
		// 예) byte(1byte) + short(2byte) => int + int => int
		//	  char(2byte) + short(2byte) => int + int => int
		
		// 1-3 byte(+-128) , short(+-3만) , char(0~6만) 오버플로우를 방지하기 위해 더 큰 타입인 int형으로 바꿔서 계산

		
		int c = 1_000_000; // 10의 6제곱
		int d = 2_000_000; // 10의 6제곱
		
		// 10의 12제곱.	int의 범위는 10의 9제곱
//		long f = c * d; // 오버플로우 발생 (int의 범위 20억을 넘어섬)
		long f = (long)c * d; // 하나의 변수를 long으로 형변환
		System.out.println(f);
		
	}
}

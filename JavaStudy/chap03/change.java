package chap03;

public class change {
	public static void main(String[] args) {
		//형변환 = 변수 또는 상수의 타입(피연산자)을 다른 타입으로 변환하는 것
		double d = 85.4;
		int num = (int)d; // double을 정수형으로 변경
		
		System.out.println(num);
		
		char a = 'A'; 
		int b = (int)a; // 유니코드 형태로 바뀐다
		System.out.println(b);
		
		// 자동 형변환 = 값 손실이 없으면 자동형변환 하지만 값 손실이 있으면 직접 형변환
		
		float f = 1234; // float형태 int형보다 범위가 크기 때문에 자동형변환 가능
		System.out.println(f);
		
		int i = (int)3.14f; // 에러 직접 형변환(값손실 발생)
		System.out.println(i);
		
		byte c = 100;
		int g = c; // 생략가능
		System.out.println(d);
		
		int i2 = 300;
		byte b2 = (byte)i2; //  값 손실이 있기 때문에 (직접자동형변환)생략불가
		System.out.println(b2);
		
		
		
		
		
		
		
		
	}
}

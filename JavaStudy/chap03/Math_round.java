package chap03;

import javax.sound.midi.Soundbank;

public class Math_round {
	public static void main(String[] args) {
		// 반올림 => Math.round() => 실수를 소수점 첫 째자리에서 반올림한 정수를 반환
		long result = Math.round(4.52); // 소수점을 버리고 정수형으로 반올림
		System.out.println(result);
		
		
		
		//값 3.142를 원한다
		
		double pi = 3.141592;
		double shortPi=Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		System.out.println(pi*1000);
		System.out.println((int)(pi * 1000)); // 소수점을 날린다
		System.out.println((int)(pi * 1000)/1000.0); // 소수점 첫째자리까지
		
		// 정수형으로 바꾸고싶다
		int longPi = (int)shortPi;		
		System.out.println(longPi);
//		Math.round(pi * 1000 ) = 3142
//		=>3142 / 1000.0
//		=>3.142
		
		// 나머지 연산자
		
		int x = 10;
		int y = 8;
		
		System.out.printf("몫은 %d 이고 나머지는 %d 이다 %n",x/y , x%y);
		System.out.println(10 % -8); // 앞에 붙은 -무시한다
		
		
	}
}

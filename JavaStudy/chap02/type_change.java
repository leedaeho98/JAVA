package chap02;

public class type_change {
	public static void main(String[] args) {
		// 1. 문자와 숫자간의 변환
		System.out.println((char)(3 + '0')); // 숫자에서 문자로 변환
		System.out.println('3' - '0'); // 문자에서 숫자로 변환
		
		// 2. 숫자를 문자열로의 변환
		System.out.println("" + 3); // 숫자를 문자열로 변환
		System.out.println('3' + ""); // 문자를 문자열로 변환
		
		// 3. 문자열을 숫자로 변환
		System.out.println(Integer.parseInt("3")); // 문자열을 정수로 변환
		System.out.println(Double.parseDouble("3.4")); // 문자열을 실수로 변환
		
		// 4. 문자열을 문자로 변환
		System.out.println("3".charAt(0) - '0'); // 문자로 변환
	}
}

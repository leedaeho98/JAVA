package java_23_03_12;

public class StringMethod {

	public static void main(String[] args) {

				// 1. String클래스는 char[]와 메서드(기능)을 결합한것
				// 1-1 String클래스 = char[] + 메서드(기능)
				
				// 2.String클래스는 내용을 변경할 수 없다(read only)
//				String a = "a"; // 1주소값
//				String b = "b"; // 2주소값
//				a = a+b; // 1주소값으로 보이겠지만 3이라는 주소값이 생김
				
				// 3.String클래스의 주요 메서드
				// 3-1 (char) charAt(int index) => 문자열에서 해당 위치(index)에 있는 문자를 반환한다.
				// 3-1ex) 
				String str = "ABCDE";
				char chr = str.charAt(4); // => D를 chr에 반환한다
				System.out.println(chr);
				
				// 3-2 (int) length() => 문자열의 길이를 반환한다.
				// 3-2ex) 
				int it = str.length(); //=> 문자열의 길이인 5개를 it에 반환
				System.out.println(it);
				
				// 3-3 (String) substring(int from, int to) => 문자열에서 해당 범위(from~to)의 문자열을 반환한다(to는 포함 안됨)
				// 3-3ex) 
				String tmp = str.substring(1); // => 인덱스 1번부터 4번 직전까지 반환
				String str2 = str.substring(1,str.length()-1);
				System.out.println(str2);
				System.out.println(tmp);
				
				// 3-4 (boolean) equals(Object obj) => 문자열의 내용이 같은지 확인. 같으면 true, 다르면 false
				
				// 3-5 (char[]) toCharArray() => 문자열을 문자배열(char[])로 변환해서 반환한다
				
	}

}

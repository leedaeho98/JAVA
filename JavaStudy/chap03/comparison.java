package chap03;

public class comparison {
	public static void main(String[] args) {
		// 문자열 비교
		// 문자열 비교에는 == 대신 equals() 사용해야 한다
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2); // True
		System.out.println(str1.equals(str2)); //False
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4); // false
		System.out.println(str3.equals(str4)); //true
	}
}

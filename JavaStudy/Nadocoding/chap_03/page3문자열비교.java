package chap_03;

public class page3문자열비교 {
public static void main(String[] args) {
	//문자열 비교
	String s1 = "Java";
	String s2 = "Python";
	
	System.out.println(s1.equals("Java")); //같으므로 true
	
	//대소문자 구분 없이 문자열 내용이 같은지 여부 체크
	System.out.println(s2.equalsIgnoreCase("python"));
	
	//문자열 비교 심화
	s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보
	s2 = "1234";
	System.out.println(s1.equals(s2)); //true (내용 비교)
	System.out.println(s1 == s2); //true (참조)
	
	//자바에서 문자열 비교는 equals만 기억
	//자바에서 문자열 비교 등호는 x
	
	s1 = new String("1234"); //서로 다른 메모리공간에 있음(같이 참조 x)
	s2 = new String("1234"); //서로 다른 메모리공간에 있음(같이 참조 x)
	System.out.println(s1.equals(s2));
	System.out.println(s1 == s2); 
	//서로 다른 메모리공간에 있어서 false
	
}
}

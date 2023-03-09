package chap_07;

public class variblescofe {
	//지역변수와 전역변수 
	//변수가 선언된 중괄호 내에서만 사용가능 (지역변수)
	
	public static void methodA(int number) {
		System.out.println(number);
	}
	
	public static void methodB() {
		int result = 1; //지역변수 (1개의 메소드에서만 쓸수 있는 변수)
	}
	public static void main(String[] args) {
		int number = 3; //전역변수
		methodA(3);
		
		for (int i = 0 ; i < 5 ; i++) {
//			System.out.println(i);
		}
//		System.out.println(i); //반복문을 벗어나면 i는 삭제
		
//		{
			int j = 0;
			System.out.println(number);
			
		}
	}


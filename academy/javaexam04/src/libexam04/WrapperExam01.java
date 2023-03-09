package libexam04;

public class WrapperExam01 {
	
	public static void main(String[] args) {
		
		// MAX_VALUE = 최대값이 나옴
		// MIN_VALUE = 최소값이 나옴 = ~(not의미)를 붙이면 최대값이 나옴
		System.out.println("정수형타입의 최대값 : " + (Byte.MAX_VALUE ) ); // +1을 하면 최소값이 나옴
		System.out.println("정수형타입의 최소값 : " + (Byte.MIN_VALUE ) ); // ~not이라는 의미다 그러므로 최대값이 나온다 
		System.out.println(~(-25)+1);
		System.out.println(~(25)+1);
		
		System.out.println(Integer.parseInt("123") +45); // 
		
		short data1 = 12;
		short data2 = 24;
		short data3 = 36;
		int data4 = data1 + data2;
		// 
		
		
		
	}
}

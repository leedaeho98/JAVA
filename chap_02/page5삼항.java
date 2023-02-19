package chap_02;

public class page5삼항 {
	public static void main(String[] args) {
		//삼항 연산자
//		(결과) = (조건) ? (참일 경우 결과값) : (거짓의 경우 결과값)
		int x = 5;
		int y = 5;
		int max = (x > y) ? x : y; //결과값(max) = 조건(x>y) ? x(참일경우 결과값) : y(거짓일 경우 결과값)
		System.out.println(max); //참일 경우 결과값이 출력
		
		int min = (x < y) ? x : y;
		System.out.println(min); //거짓일 경우 결과값이 출력
		
		boolean b = (x == y) ? true : false; //거짓이므로 false
		System.out.println(b);
		
		boolean c = (x != y) ? true : false;
		System.out.println(c);
		
		String d = (x != y ) ? "달라요" : "똑같아요";
		System.out.println(d);
		
		
	}
}

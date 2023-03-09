package chap_02;

public class page3비교 {
	public static void main(String[] args) {
		//비교 연산자 참(true) 거짓(false)
		System.out.println(3 < 5); //5 는 3보다 크다 true
		System.out.println(5 <= 3); //3은 5보다 크거나 같다 false
		System.out.println(5 <= 5); //5는 5보다 크거나 같다 true
		System.out.println(5 <= 7); //7은 5보다 크거나 같다 true
		
		System.out.println(5 < 3); //5는 3보다 작다( false)
		System.out.println(5 <= 3); //5는 3보다 작거나 같다 (false)
		
		System.out.println(5 == 5); //5와 5는 같다 (true)
		System.out.println(5 == 3); //5는 3과 같다 (false)
		System.out.println(5 != 5); //5는 5와 같지않다 (false)
		System.out.println(5 != 3); //5는 3보다 같지않다 (true)
	}

}

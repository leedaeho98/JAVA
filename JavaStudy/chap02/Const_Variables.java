package chap02;

public class Const_Variables {

	public static void main(String[] args) {
//		int score = 300; // 변수 : 변할 수 있는 값
		final int score = 400; //상수 : 한번 값을 정하면 변할 수 없는 값
//		score = 100;
		System.out.println(score);
		
		//기존 상수 값에 다른 값을 넣으려고 하면 뜨는 에러
		//The final local variable score cannot be assigned. 
		//It must be blank and not using a compound assignment

	}

}

package chap_06;

public class arrayLoop {
	public static void main(String[] args) {
		//배열의 순회
		String[] coffees = {"아메리카노","카페모카","카페라떼","에스프레소"};
		
//		//for 반복문 순회
//		for (int i = 0; i<4;i++) {
//			System.out.println(coffees[i] +"하나");
//		}
//		System.out.println("주세요");
		
		// 배열의 길이를 이용한 순회
//		for (int i = 0; i<coffees.length ;i++) {
//			System.out.println(coffees[i] +"하나");
//		}
//		System.out.println("주세요");
		
		// enhanced for (for-each) 반복문
		//list 순회할때 편함
		//위랑 값이 같음
		//coffees의 값이 coffee 안에 값을 하나씩 대입
		for (String coffee : coffees) {
			System.out.println(coffee + "하나");
		}
	}
}

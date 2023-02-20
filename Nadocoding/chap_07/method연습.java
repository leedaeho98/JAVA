package chap_07;

public class method연습 {
	
//	메소드 정의
	public static void Option() {
	int i; 
	for (i = 0 ; i<= 10 ; i++ ) {
		System.out.println("반갑습니다 현재 고객님 점수는" + i + "점 입니다");
	}
}
	//메소드 정의
	public static void Yolo(int number) {
	int sum = number * number;
	System.out.println(number + "의 승은 " + sum + "입니다");
	}
		
	
	public static void main(String[] args) {
		Option(); //메소드 정의된 값을 메인으로 호출해서 값을 출력
		Yolo(5); //메소드 대괄호 안에 정의된 변수의 값을 메인에서 전달해준다
		
		
	
		
	}

}

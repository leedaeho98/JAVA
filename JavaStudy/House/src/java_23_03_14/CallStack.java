package java_23_03_14;

public class CallStack {
	/* 호출 스택(call stack) => stack => 밑이 막힌 상자. 위에 차곡차곡 쌓인다 
	   호출 스택이란 =>	
	    1. 메서드 수행에 필요한 메모리가 제공되는 공간
	    2. 메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제
	 */
	/*
	 메인 호출 스탯 흐름
	 1. 아래 옆이 막힌 상자 위에서만 차곡차곡쌓인다 처음엔 빈상자
	 2. 메인 메서드가 쌓인다 (실행중)
	 3. println이 위에 쌓이고 main메서드는 대기상태 println한테 일을 시킨다(실행중)
	 4. println이 작업을 다 끝내면 소멸 후 main메서드는 실행상태
	 5. main메서드는 실행할 문장이 없으므로 프로그램 종료
	 */
		public static void main(String[] args) {
			System.out.println("Hello");
	
		}
}

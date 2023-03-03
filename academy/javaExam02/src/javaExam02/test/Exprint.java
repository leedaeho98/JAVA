package javaExam02.test;

public class Exprint {
	public static void main(String[] args) {
//		ExSuper sp = new ExSub();
//		Exsub sb = new Exsub(); // 안좋은 방법이다
//		printInfo(sp); // sp를 printInfo로 넘겨준다
		printInfo(new ExSub());
		
		System.out.println("==============");
		
		printInfo(new ExSuper()); 
		
		loopPrint(1, 11, 2); // 짝수의 합 => loopPrint에 값을 준다
		loopPrint(2, 11, 2); // 홀수의 합 => loopPrint에 값을 준다
	}
	public static void printInfo(ExSuper sp) { // Exsuper를 타입으로 정하면 하위타입도 들어올 수 있다
		sp.prn();
	}
	
	
	public static void loopPrint(int i , int e , int a) {
		int result = 0;
		for ( int j = i; j < e ; j = j+a) {
			result = result + j;
		}
		System.out.println(" 합 => "+ result);
	}
}

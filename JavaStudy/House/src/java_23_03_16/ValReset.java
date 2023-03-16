package java_23_03_16;

import java.util.Arrays;

class StaticBlockTest{
	// 멤버변수
	
	// 클래스 변수
	static int[] arr = new int[10]; // 명시적 초기화
	
	static { // 클래스 복잡초기화 블럭 - 배열 arr을 난수로 채운다
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		
	}
	
}


public class ValReset {
	// 인스턴스 변수 => 변수가 0으로 자동 초기화
//	int x;
//	int y = x; 
//	
//	// 메서드 => 지역변수는 수동으로 초기화해야함
//	void method1() {
//		int i = 0; // 지역변수
//		int j = i; // 에러 => 지역변수를 초기화해야함
//	}
	public static void main(String[] args) {
		
		int[] result=StaticBlockTest.arr;
		
		System.out.println(Arrays.toString(result));
		
	}
}
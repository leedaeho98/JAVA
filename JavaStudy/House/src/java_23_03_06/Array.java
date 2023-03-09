package java_23_03_06;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// 배열 => 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		// 배열을 다루려면 참조변수가 필요
		// 배열은 연속적인 특징을 가지고있다.
		
		// 1. 배열의 선언 => 배열을 다루기 위한 참조변수의 선언
		//1-1. int[] score = new int[길이] , String[] name = new String[]
		// 2. 배열의 인덱스 => 인덱스의 범위는 0부터 배열길이 -1 까지
		
		int[] score1 = new int[]{1,2,3,4,5}; // 배열의 선언과 생성을 동시에
		
		int value = score1.length; 
		// 배열은 한번 생성하면 그 길이를 바꿀 수 없다
		// 그러므로 for문 length를 써서 길이를 자유자재로 바꾼다
		
		
//		for (int i = 0; i < value ; i = i + 1) {
//			System.out.printf("score의 값은 %d %n" , score[i]);
		
		int[] arr = new int[5]; // 길이가 5인 int배열 arr을 생성
		System.out.println("arr.length = " + arr.length); // 배열의 길이가 5이므로 5가 출력
		
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.printf("arr[%d]=%d %n",i,arr[i]); //배열의 모든 요소 출력
		}
		// 배열의 초기화 => 배열의 각 요소에 처음으로 값을 저장하는 것
		int[] score2 = new int[5]; // 길이가 5인 int형 배열을 생성한다.
		
		// 각 요소에 직접 값을 저장한다
		score2[0] = 50;
		score2[1] = 60;
		score2[2] = 70;
		score2[3] = 80;
		score2[4] = 90;
		
		// 베열 값 초기화하는 여러가지 방법
		int[] score3 = new int[] {50,60,70,80,90};
		int[] score4 = {50,60,70,80,90}; // 이 방법 많이 사용
		
		// 배열 초기화 에러 => int[] score = new int[]{값} => 이 방법을 써야함
//		int[] score3;
//		score = {50,60,70,80,90};
		
		// 배열의 출력
		int[] iArr = {100,95,80,70,60};
		System.out.println(iArr); // [I@28f67ac7와 같은 형식의 문자열이 출력된다. => I(int타입)@(위치)14318bb(주소값)
		
		// length를 이용한 모든배열 출력 Arr[i]  =>  i에 Arr의 값이 한개씩 들어간다
		for(int i = 0 ; i < iArr.length; i++) {
			System.out.printf("i의 값은 [%d] = %d %n" , i , iArr[i]);
		}
		
		// Arrays.toString을 이용한 모든 배열 출력
		System.out.println(Arrays.toString(iArr));
		
		// char(문자)타입의 출력 => char타입만 다른 타입과 다르게 abcd가 출력된다
		char[] chArr = {'a','b','c','d'};
		System.out.println(chArr);
		
		
		
		
	}
}

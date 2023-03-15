package java_23_03_09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArrayUses {
	
	public static void main(String[] args) {
	Random rnd = new Random();
	// 배열 예제 1
	int[] score = {100,88,100,100,90};
	int sum = 0; // 합계를 구할 변수
	double average = 0.0;
	
	for (int i = 0 ; i < score.length ; i++) {
		sum += score[i];
	}
//	
	average = sum/(float)score.length; // sum(int)은 범위가 넓은 float형으로 형변환
//	// 프린트문에서 형변환을 하면 값손실이 일어나기 때문에 그 전에 한다
	System.out.printf("총 합은 %d , 평균 %.1f %n",sum,average);

	// 배열 예제 2
	int[] num = {79, 88, 91, 33, 100, 55, 95};
	
	int max = num[0]; // 배열의 첫 번째 값으로 최대값을 초기화한다
	int min = num[0]; // 배열의 첫 번째 값으로 최소값을 초기화한다
	for (int i = 1 ; i < num.length ; i++ ) { // 배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화
		if (num[i] > max) { // max 79 max = 88 = 91 = 100 
			max = num[i];
		}else if (num[i] < min) { 
			min = num[i];
		}
	}
	System.out.println("최대값 = " + max);
	System.out.println("최소값 = " + min);
	
	// 배열의 활용(3)
	int[] numArr = {0,1,2,3,4,5,6,7,8,9};
	
	System.out.println(Arrays.toString(numArr));
	for (int i = 0 ; i < numArr.length ; i++) {
		int n = (int)(Math.random()*10); // 0~9 중의 한 값을 임의로 얻는다
		int tmp = numArr[i];
		numArr[i] = numArr[n];
		numArr[n] = tmp;
	}
	System.out.println(Arrays.toString(numArr));
	
	// 배열의 활용(로또번호)
	
	int[] ball = new int[45]; // 45개의 정수값을 저장하기
	
	// 배열의 각 요소에 1~45의 값을 저장한다
	for (int i = 0 ; i < ball.length ; i++) 
		ball[i] = i+1;
//		System.out.println(Arrays.toString(ball));
	
	int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
	int j = 0; // 임의의 값을 얻어서 저장할 변수
	
	// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을
	// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다
	for(int i = 0 ; i < 6 ; i++) {
		j = (int)(Math.random()*45); // 0~44 중의 한 값을 임의로 얻는다
		tmp = ball[i];
		ball[i] = ball[j];
		ball[j] = tmp;
	}
	System.out.println(Arrays.toString(ball));
	}
}

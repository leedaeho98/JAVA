package java_23_03_09;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	// 2차원 배열 => 테이블 형태의 데이터를 저장하기 위한 배열
//	// 1번학생~4번학생까지 모두 담은걸 2차원배열
//	// 1번학생 => 국어 : 60 , 수학 , 40 , 영어 50 => 1차원배열
//	// 2번학생 => 국어 : 60 , 수학 , 40 , 영어 50 => 1차원배열
//	// 3번학생 => 국어 : 60 , 수학 , 40 , 영어 50 => 1차원배열
//	// 4번학생 => 국어 : 60 , 수학 , 40 , 영어 50 => 1차원배열
//		
//	// 2차원 배열 생성 및 배열 초기화 하는 방법
//	// 1번~ 4번학생 (행) , 국어 수학 영어(열)
//	// 인덱스 번호는 [0~3][0~2] , [1~3][0~2]
//	int[][] score = new int[4][3]; // 4행 3열의 2차원 배열 생성
//	int[][] arr = {
//			{ 100, 100, 100 ,100}, // 1개의 배열만 있으면 1차원
//			{ 20, 20, 20,30}, // 2개이상 있으면 2차원
//			{ 30, 30,},
//			{ 40, 40}
//			};
//	int sum = 0;
//	
//	// 2차원 모든 배열 출력
//	for (int i = 0 ; i < arr.length ; i++) { // arr.(.은 안에) 들어가면 참조변수가 있다
//		for (int j = 0 ; j < arr[i].length ; j++) { // arr[i].length 참조변수 (.)안에 들어가면 배열 값
//			sum+=arr[i][j];
//			System.out.printf("arr[%d][%d]=%d %n",i,j,arr[i][j]);
		

		// 2차원 배열 예제
		int score1[][] = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		int kor = 0 , eng = 0 , math = 0;
		
		System.out.println("번호   국어   영어   수학   총점   평균");
		System.out.println("=====================================");
		for (int i = 0; i < score1.length ; i++ ) {
			int sum = 0;	//개인별 총점
			float avg = 0.0f; // 개인별 평균
			
			kor += score1[i][0]; //
			eng += score1[i][1];
			math += score1[i][2];
			System.out.printf("%3d ", i+1);
			
			for (int j = 0 ; j < score1[i].length ; j++) {
				sum += score1[i][j];
				System.out.printf("%5d", score1[i][j]);
			}
			avg = sum/(float)score1[i].length;
			System.out.printf("%7d   %.1f%n" ,sum,avg);
			System.out.println("======================================");
		}
		System.out.printf("총점: %4d %4d %4d %n%n" , kor ,eng, math);
		
		
		// 2차월 배열 예제
		String[][] words = {
				{"chair","의자"},		
				{"computer","컴퓨터"},		
				{"integer","정수형"}
		};
		for (int i = 0 ; i < words.length ; i++) {
			System.out.printf("Q%d. %s의 뜻은 ? ",i+1,words[i][0]);
			
			String tmp = sc.nextLine();
				
				if (tmp.equals(words[i][1])){
					System.out.printf("정답입니다 %n%n");
				}else {
					System.out.printf("틀렷습니다, 정답은 %s 입니다 %n%n",words[i][1]);
				
			}
		}
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
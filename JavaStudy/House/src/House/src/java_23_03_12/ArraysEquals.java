package java_23_03_12;

import java.util.Arrays;

public class ArraysEquals {
	public static void main(String[] args) {
	// 1. Math클래스 : 수학관련 메소드 모음
	// 1-1. Math.round() => 반올림
	// 1-2. Math.random() => 난수 
		
	// 2. Arrays로 배열 다루기
	// 2-0. 배열의 비교와 출력 => equals(), toString()
	// ex) 
	int[] arr = {0,1,2,3,4}; // => 1차원 배열
	System.out.println("1차원 배열 출력 : " +Arrays.toString(arr)); // => 배열 문자열로 반환
	// ex) 
	int[][] arr2D = {{11,12},{21,22}}; // => 2차원배열
	System.out.println("2차원 배열 출력 : " +Arrays.deepToString(arr2D)); // => 2차원 배열쓸때 deepToString 유용
	
	String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}}; 
	String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}}; 
	
	// 1차원 배열일때는 equals로 비교 가능
	// 2차원 배열일때는 deepEquals를 쓰면 더 정확히 값 비교가능
	System.out.println("2차원 배열 비교 equals : " +Arrays.equals(str2D,str2D2)); // False
	System.out.println("2차원 배열 비교 deepEquals : " +Arrays.deepEquals(str2D,str2D2)); // True
	
	// 2-1 배열의 복사 => copyOf, copyOfRange()
	// copyOf = 처음부터 ~ 인덱스번호직전까지 (맨앞부터복사)
	int[] array1 = {0,1,2,3,4};
	System.out.println(Arrays.toString(array1));
	
	int[] array2 = Arrays.copyOf(array1, array1.length); // 인덱스0번부터 문자열의 길이까지
	System.out.println(Arrays.toString(array2)); // array2 = [0,1,2,3,4]
		
	int[] array3 = Arrays.copyOf(array1, 7); // 인덱스0번부터 인덱스 7번 직전까지 범위 넘으면 0으로 반환
	System.out.println(Arrays.toString(array3));
	
	// copyOfRange() = 인덱스번호 1부터 ~ 4번 직전까지 (중간부터 복사가능)
	int[] array4 = Arrays.copyOfRange(array1, 0,7); // 배열 array1에 인덱스 0번부터 7번 직전까지 범위 넘으면 0으로 반환
	System.out.println(Arrays.toString(array4));
	
	// 2-2 배열의 정렬 => sort()
	
	int [] aray = {3,2,0,1,4}; 
	System.out.println("정렬 전 : " +Arrays.toString(aray));
	Arrays.sort(aray); // 오름차순으로 정렬
	System.out.println("정렬 후 : " +Arrays.toString(aray));
	
		
	}
}

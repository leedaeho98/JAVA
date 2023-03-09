package java_23_03_09;

import java.util.Arrays;
import java.util.Random;

public class StringArrays {
	
	public static void main(String[] args) {
	Random rnd = new Random();	
	String[] name1 = new String[3]; // 3개의 문자열을 담을수 있는 배열
	System.out.println(Arrays.toString(name1)); // 참조타입은 null값이 나온다
	
	// 문자열 배열 값 초기화 여러가지 방법
//	String[] name2 = new String[] {"kim","simson","Lee"};
	
	// 랜덤메소드를 사용해 한개만 출력
	String[] name3 = {"가위","바위","보"};
	System.out.println(Arrays.toString(name3));
	
	for(int i= 0 ; i < 1 ; i++) {
		int tmp = (int)(Math.random()*3);
		System.out.println(name3[tmp]); 
	}
	System.out.println(Arrays.toString(name3));
	
	// 커맨드 라인을 통해 입력받기 
	System.out.println(args.length);
	System.out.println(Arrays.toString(args));
	
	
	
	
	
	
	
	
	}
}

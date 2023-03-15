package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {
//		// 배열을 이용한 예제 1-1
		Scanner sc = new Scanner(System.in); 
//		int[] num = new int[5];
//		
//		for (int i = 0 ; i < num.length ; i++) {
//			num[i] = sc.nextInt();
//			System.out.printf("%d ",num[i]);
//		}
		
		// 배열을 이용한 예제 1-2
		// charAt는 문자 형태로 입력받게 해주며 () 괄호는 인덱스번호를 뜻한다
//		char[] chr = new char[10];
//		int i;
//		for (i = 0 ; i < chr.length ; i++) {
//			chr[i] = sc.next().charAt(0); // 
//			System.out.print(chr[i]);
//		}
//		int[] one = new int[10];
//		int i;
//		
//		for (i = 0 ; i < one.length ; i++) {
//		one[i] = sc.nextInt();		
//		}
//		System.out.printf("%d %d %d",one[2], one[4], one[one.length-1]); // 이게 좋은 방법
//		
		// 배열을 이용한 예제 1-3
//		int[] pass = new int[100];
//		int i;
//		
//		for (i = 0; i < pass.length ; i++) {
//		pass[i] = sc.nextInt();
//		
//		if (pass[i]%2 == 1) 
//			System.out.printf("%d ",pass[i] );
//		
//		if (pass[i] == 0)  
//			break;	
//		
		// 베열을 이용한 예제 1-4 (연습요망)
		int[] arr = new int[100];
		int i, cnt = 0;

		for( i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();

			if( arr[i] == 0)
			{
				break;
			}

			cnt++;
		}

		for( i=cnt-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
	

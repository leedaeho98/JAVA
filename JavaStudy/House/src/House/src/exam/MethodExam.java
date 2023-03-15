package exam;

import java.awt.Window.Type;
import java.util.Scanner;

public class MethodExam {
	Scanner sc = new Scanner(System.in);
	// 문제 1-1
	int number(int x , int y) {
		int result = 0;
		x = sc.nextInt();
		y = sc.nextInt();
		result = x > y ? x : y;
		return result;
	}
	
	// 문제 1-2
	static int decimal(int a) {
		int cnt = 0;
		for (int i=1; i<a; i++) {
			if(a%i == 0 ) {
				cnt ++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
//		System.out.print("두 정수를 입력하여 큰 정수를 결과로 출력 : ");
//		MethodExam num = new MethodExam();
//		
//		int result =num.number(0, 0);
//		System.out.println("두 정수중에서 가장 큰 값은 : " + result);
//		
	// 정수 1개를 입력 -> 소수인지 아닌지 -> O,X 출력
		
		System.out.print("정수 1개를 입력 소수점이면 O , 아니면 X : ");
		int num1 = sc2.nextInt();
		if ( decimal(num1) == 1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
	}
}

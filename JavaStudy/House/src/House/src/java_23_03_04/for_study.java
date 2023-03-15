package java_23_03_04;
import java.util.*;
public class for_study {
	public static void main(String[] args) {
		// for문 => 조건을 만족하는 동안 블럭{}을 반복 => 반복횟수를 알 때 적합
		// 조건식을 생략하면, true로 간주되어서 무한반복문이 됨
//		Scanner sc = new Scanner(System.in);
//		System.out.print("합을 적으세요 : ");
//		int num = sc.nextInt();
//		int sum = 0;
//		for (int i = 0 ; i<=num ; i++) { // (1부터 ; 5까지 ; 1씩증가`
//			sum+=i;
//			System.out.printf("1 ~ %d 합은 %d %n" ,i,sum);
//		}
//		
		
		// 중첩 for문
//		Scanner sc = new Scanner(System.in);
//		System.out.print("보고싶은 구구단을 작성하세요 : ");
//		int goo = sc.nextInt();
//		int i,j;
//		int sum=0;
//		
//		for (i = goo; i <= goo ; i++) {
//			System.out.printf("== %d단을 시작 ==%n",i);
//			for (j = 1 ; j<= 9 ; j++) {
//				System.out.printf("%d * %d = %d %n",i,j,sum);
//				
//			}
//			System.out.printf("%d단의 총 합은 =% d " ,i,sum);
//		}
//		
		
		int i,j;
		
		for (i=1; i<=5 ; i++) {
			for(j=1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
				
		}
	}
}

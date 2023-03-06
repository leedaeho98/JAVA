package example;
import java.util.*; // import문 사용

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.w3c.dom.ls.LSOutput;

public class Study_1_10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 1-1
//		System.out.println("Hello World!!");
		
		// 1-2
		
//		System.out.println("안녕하세요 반갑습니다 \n 저는 열혈 청년 홍길동 입니다 \n 잘 부탁드리겠습니다!");
		
		// 1-3
//		String name = "홍길동";
//		String iD = "2018122104";
//		double height = 1.78;
//		boolean gender = true;
//		
//		System.out.printf("이름 : %s %n" , name);
//		System.out.printf("학번 : %s %n" , iD);
//		System.out.printf("신장 : %.2fm %n" , height);
//		System.out.printf("남자인가요? : %b " , gender);
		
		// 1-4
//		String name1 = "한우 꽃등심";
//		int price1 = 112500;
//		
//		String name2 = "참치 선물팩";
//		int price2 = 25500;
//		
//		String name3 = "맥스봉 한팩";
//		int price3 = 500;
//		
//		System.out.printf("품명 : %-10S 가격 : %10d %n ",name1 , price1);
//		System.out.printf("품명 : %-10S 가격 : %10d %n",name2 , price2);
//		System.out.printf("품명 : %-10S 가격 : %10d %n",name3 , price3);
		
		// 1-5
//		int price1 = 8000;
//		int count1 = 16;
//		
//		int price2 = 10000;
//		int count2 = 8;
//		
//		int price3 = 5000;
//		int count3 = 1;
//		
//		int sum1 = price1 * count1; // 돈까스의 총 값
//		int sum2 = price2 * count2; // 칼국수의 총 값
//		int sum3 = price3 * count3; // 왕만두의 총 값
//		
//		int result = sum1 + sum2 + sum3; // 돈까스 칼국수 왕만두 3개의 값
//		
//		System.out.printf("돈까스 * %d = %d %n" , count1,sum1);
//		System.out.printf("돈까스 * %d = %d %n" , count2,sum2);
//		System.out.printf("돈까스 * %d = %d %n" , count3,sum3);
//		System.out.println("===========================");
//		System.out.printf("총 합은 : %d" , result);
		
		// 1-6
//		System.out.print("시급 : ");
//		int price = scanner.nextInt();
//		
//		System.out.print("일한시간 : ");
//		int time = scanner.nextInt();
//		
//		int result = time * price;
//		
//		System.out.printf("일급은 : %d 입니다", result);
		
//		// 1-7
//		//환율 변수 생성
//		double euro1 = 1320.48026;
//		double dollar1 = 1063.82979;
//		
//		// 화면에서 입력받기
//		System.out.print("유로를 적어주세요 : ");
//		int euro2 = scanner.nextInt();
//		System.out.print("달러를 적어주세요 : ");
//		int dollar2 = scanner.nextInt();
//		
//		int won = (int)(euro1 * euro2 + dollar1 * dollar2);
//		
//		
//		
//		System.out.printf("%d유로 + %d달러 = %d원 " ,euro2,dollar2,won );
//		
		// 1-8
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.printf("%d ( = %d + %d + %d",sum , num1 ,num2 , num3);
	
		
		
	}
}

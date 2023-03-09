package exam;
import java.util.*;

import javax.management.AttributeList;
import javax.sound.midi.Soundbank;
public class if_elif {
	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 기온 입력
//		System.out.print("기온을 입력하세요 : ");
//		int temp = sc.nextInt();
//		
//		// 조건문
//		if (temp >= 21) {
//			System.out.println("반팔");
//		
//		}else {
//			System.out.println("외투");
//		}
		// 돈을 입력받아 카페사기
//		System.out.print("돈 입력하세요 : ");
//		int money = sc.nextInt();
//		
//		if (money >= 2500) {
//			System.out.println("아이스바닐라라떼");
//		}else if(money >= 1500) {
//			System.out.println("아메리카노");
//		}else {
//			System.out.println("물");
//		}
		
//		 기본시급 5000 , 기본 근무시간 8시간 초과근무수당 1.5배
//		System.out.print("노동시간을 입력하세여 : ");
//		int time = sc.nextInt();
//		int money = 5000;
//		
//		// 가본시급 + 노동시간
//		int sum = money * time; 
//		
//		if (time >= 9) {
//			System.out.println("총 임금은 : " + sum *1.5 );
//		
//		}else {
//			System.out.println("총 임금은 : " + sum);
//		}
		
//		System.out.print("국어 , 영어 , 수학 성적을 차례대로 입력 : ");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z = sc.nextInt();
//		
//		int sum = (x+y+z)/3;
//		
//		if (sum >= 90) {
//			System.out.println("평균 : " + sum);
//		}else if (sum >= 80) {
//			System.out.println("평균 : " + sum);
//		}else if (sum >= 70) {
//			System.out.println("평균 : " + sum);
//		}else {
//			System.out.println("평균 : " + sum);
//		}
		
		// 성과급 계산 프로그램
		System.out.print("성과급을 입력하세요");
		int money = sc.nextInt();
		
		if (money >= 300) {
			System.out.println("보너스는 : " +money+50);
		}else if (money >= 200) {
			System.out.println("보너스는 : " +money+30);
			
		}else if (money >= 100) {
			System.out.println("보너스는 : " +money+10);
		}else {
			System.out.println("보너스는 없음 " + money);
		}
	}
}

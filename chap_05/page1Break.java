package chap_05;

public class page1Break {
	public static void main(String[] args) {
	//break문
	//치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
	
	//For문
	int max = 20; //치킨 재고
		
	for(int i = 1 ; i<= 50 ; i++) {
		System.out.println(i + "번 손님 주문하신 치킨 나왔습니다");
		if (i == max) {
			System.out.println("금일 재료가 소진되었습니다");
			break; //반복문을 탈출
		}
	}
	System.out.println("오늘 장사를 마감하겠습니다");
	
	System.out.println("-----------------");
	
	int i = 1; //손님 대기번호
	while (i<=50) {
		System.out.println( i +"번 손님 주문하신 치킨 나왔습니다");
		//1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 14 ,15 ,16, 17, 18 ,19 
			if (i == max) {
				System.out.println("금일 재료가 소진되었습니다");
				break;
			}
			i++; //
			
			
	}
	System.out.println("장사가 마감되었습니다");
	}
}
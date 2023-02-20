package chap_05;

public class page2continue {
	public static void main(String[] args) {
		
	//치킨 주문 손님중에 노쇼 손님이 잇다고 가정
	//For 
	int max = 20; //최대 치킨 판매 수량
	int sold = 0; // 현재 치킨 판매 수량
	int noShow = 17;
	for (int i = 1 ; i<= 50 ; i++) {
		System.out.println(i + " 번 손님, 주문하신 치킨 나왔습니다");
		
		if (i == noShow) {
			System.out.println(i+"번째 손님 , 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
			continue;
		}
		
		sold++; //판매처리
		if (sold == max) {
			System.out.println("금일 재료가 소진되었습니다");
			break;
		}
	}
	System.out.println("영업을 마감하겠습니다");
	
	System.out.println("---------------------------------");
	
	int index = 0;
	sold = 0;
		while(index <= 50) {
			index++;
			System.out.println(index + "번 손님 주문하신 치킨 나왔습니다" );
			
			if (index == noShow) {
				System.out.println(index + "님은 노쇼이므로 다음 손님 받겠습니다");
				continue;
			}
			sold++;
			if (sold == max) {
				System.out.println("금일 재료가 소진되었습니다");
				break;
			}
			}
				
			}
		
	}


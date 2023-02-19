package chap_04;
public class page3Elseif {
	public static void main(String[] args) {
	// 조건문 Elseif
	//한라봉 에이드가 있으면 +1
	//망고 주스가 있으면 +1
	//아이스 아메리카노가 있으면 +1
	
	boolean hallabongAde = true;
	boolean mangoJuice = true;
	boolean iceAmricano = true;
	
//	//else if 는 여러번 사용 가능
//	if(!hallabongAde) { //거짓이면 출력x 아래있는 else if로 비교
//		System.out.println("한라봉 에이드 +1");
//		
//	}else if (!mangoJuice) { //참이면 출력 하지만 거짓이면 아래 else if문 내려가서 비교 
//		System.out.println("망고쥬스 +1");
//		
//	}else if (!iceAmricano) {
//		System.out.println("아이스 아메리카노 +1");
//		
//	}else { //위 모든 조건이 false면 else문 출력
//		System.out.println("다른 카페로 갑니다");
//	}
//	
//	
	//else가 없어도 사용가능
	if(!hallabongAde) { //거짓이면 출력x 아래있는 else if로 비교
		System.out.println("한라봉 에이드 +1");
		
	}else if (!mangoJuice) { //참이면 출력 하지만 거짓이면 아래 else if문 내려가서 비교 
		System.out.println("망고쥬스 +1");
		
	}else if (iceAmricano) {
		System.out.println("아이스 아메리카노 +1");
	}
}
}

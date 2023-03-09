package chap_05;

public class page3 {
	public static void main(String[] args){
	//시간당 4시간 (최대 요금은 3만원)
	//일반 경차는 5시간 2만원
	//장애인 및 소형일 경우 50% 할인
	//장애인 10시간 15000원
	//소형 경차는 5시간 만원
		
	int time = 5; //시간은 5시간
	boolean smallCar = true; // 불리언형으로 장애인인지 소형차인지 확인
	boolean yamiCar = false;
	int max = time *4000; //4마만원
	
	if (max > 30000) {
	max = 30000;
	}
	if (smallCar || yamiCar) {
		max = max/2; //장애인 및 소형경차일 경우 지불할 요금은 지불할 요금에 /2 (50%)
		}
	System.out.println("지불하신 요금은 "+ max + "입니다");
	}
}

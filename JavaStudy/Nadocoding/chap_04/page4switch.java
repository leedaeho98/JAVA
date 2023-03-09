package chap_04;

public class page4switch {
	public static void main(String[] args) {
		
	//Switch case
	
	//석차에 따른 장학금 지급
	//1등 : 전액 장학금
	//2등 : 반액 장학금
	//3등 : 반액 장학금
	//그 외 : 장학금 대상 아님
	
	//if 문을 이용한 식(여러 조건 또는 범위에 해당하는 조건)
	int i =1;
	if (i == 1) {
		System.out.println("전액장학금 지원");
		
	}else if( i == 2 || i == 3){
		System.out.println("반액장학금 지원");		
	} else {
		System.out.println("장학금 대상 x");
	
	}
	System.out.println("조회 완료#1");
	
	int ranking = 1; 
	switch (ranking+2) // switch(조건)(명확한 케이스가 있는 경우)
	{
	case 1: System.out.println("전액장학금 지원");
	break;
	//break는 값이 참이면 문장에서 빠져나온다
	//아래 조건은 출력 x
	
	case 2:
	case 3: System.out.println("반액장학금 지원");
	break;
	
	//default = 위 모든 값이 거짓이면 출력
	default: System.out.println("장학금 대상 x");
	}
System.out.println("조회 완료#2");

	int grade = 2; //등급
	int price = 7000; //기본가격
	
	switch (grade) {
	case 1:
		price+=1000;
		break;
	case 2:
		price-=1000;
		break;
	case 3:
		price-=2000;
		break;

	}
	System.out.println("이 물건의 등급은 "+ grade +"이고 가격은 "+ price +"입니다");
}
}

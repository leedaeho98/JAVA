package example;
import java.util.*;
public class ifexam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 객체 생성 (sc는 객체 이름)
		Random rd = new Random(); // 랜덤 객체 생성
		

//		System.out.print("시험점수를 입력하세요 : ");
//		int num  = sc.nextInt();
		
//		if (num > 59) {
//			System.out.println("합격입니다");
//		} else { // 59점 아래면 
//			System.out.println("불합격입니다");
//		}
		
//		System.out.print("숫자를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		if (num2 > 0) {
//			System.out.println("양수");
//		} else if(num2 == 0){
//			System.out.println("0");
//		} else {
//			System.out.println("음수입니다");
//		}
		
//		System.out.print("과목을 선택해주세요 \n(1.수학 2.과학 3.영어 4.역사) \n과목번호 : ");
//		int num3 = sc.nextInt();
//		
//		switch (num3) 
//		{
//		case 1:
//			System.out.println("101호 입니다");
//			break; // break문을 설정 안하면 밑에것도 출력 됌
//		case 2: 
//			System.out.println("102호 입니다");
//			break;
//		case 3: 
//			System.out.println("203호 입니다");
//			break;
//		case 4:
//			System.out.println("202호 입니다");
//			break;
//		default :
//			System.out.println("상담원에게 문의 해주세요");
//		}		
//
		
//	System.out.print("숫자를 입력하세요 : ");
//	int num4 = sc.nextInt();
//	
//	if (num4 > 0){
//		System.out.println("양수입니다");
//		if (num4%2 == 1 ) 
//			System.out.println("홀수입니다"); // 홀수
//		else if(num4%2 == 0 ) 
//			System.out.println("짝수입니다"); // 짝수
//	}else if(num4 == 0) {	
//		System.out.println("0입니다");
//	}else{
//		System.out.println("음수입니다");
//	}
//	
//	System.out.print("과목은 1.수학 2.과학 3.영어 4.역사 \n과목 code 값은 ? ");
//	int num5 = sc.nextInt();
//	
//	if (num5 == 1) {
//		System.out.println("101호 입니다");
//	} else if(num5 == 2) {
//		System.out.println("102호 입니다");
//	} else if(num5 == 3) {
//		System.out.println("203호 입니다");
//	} else if(num5 == 4) {
//		System.out.println("202호 입니다");
//	} else {
//		System.out.println("상담원에게 문의 해주세요");
//	}
//	
//	가위 바위 보 게임 만들기
	int com = rd.nextInt(3)+1; // 컴퓨터 랜덤 가위바위보

	System.out.println("## 가위 바위 보 게임 ## \n(1.가위 2.바위 3.보)");
	int user = sc.nextInt();
	
	System.out.println("컴퓨터" + com);
	System.out.println("유저" + user);
	
	if (user == 1 ) { // 유저가 가위를 내면
		if (com == user) 
			System.out.println("무승부입니다");
		else if(com == 3)
			System.out.println("유저가 이겼습니다");
		else if(com == 2) 
			System.out.println("컴퓨터가 이겼습니다");
		
	}else if (user == 2 ) { // 유저가 바위를 내면
		if (com == user) 
			System.out.println("무승부입니다");
		else if(com == 1)
			System.out.println("유저가 이겼습니다");
		else if(com == 3)
			System.out.println("컴퓨터가 이겼습니다");
		
	}else if (user == 3 ) { // 유저가 가위를 내면
		if (com == user) 
			System.out.println("무승부입니다");
		else if(com == 2)
			System.out.println("유저가 이겼습니다");
		else if(com == 1)
			System.out.println("컴퓨터가 이겼습니다");

	}
	}
}



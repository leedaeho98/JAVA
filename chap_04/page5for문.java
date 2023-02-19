package chap_04;

public class page5for문 {
	public static void main(String[] args) {
		//반복문 for
		//나코 매장
		System.out.println("어서오세요.나코입니다");
		//또 다른 손님이 들어오면?
		System.out.println("어서오세요.나코입니다");
		System.out.println("어서오세요.나코입니다");
		System.out.println("어서오세요.나코입니다");
		System.out.println("어서오세요.나코입니다");
		
		System.out.println("환영합니다. 나코입니다");
		//만약에 인사 법이 바뀌면?
		System.out.println("환영합니다. 나코입니다");
		System.out.println("환영합니다. 나코입니다");
		System.out.println("환영합니다. 나코입니다");
		
		
		//매장이름이 바뀌면?
		//나코 -> 코나
		System.out.println("환영합니다. 코나입니다");
		System.out.println("환영합니다. 코나입니다");
		System.out.println("환영합니다. 코나입니다");
		
		
		System.out.println("------------");
		//반복문 사용 for
		//for (선언;조건;증감){범위}
		int i;
//		for (i=0; i<10 ; i++) {
//			System.out.println("환영합니다 나코입니다 "+i);
		
		//짝수만 출력
		
		for(i=0;i<=10; i+=2) { //i+=2 증감식으로 짝수만 출력
			System.out.print(i);
		}
		
		System.out.println("");
//			
		//홀수만 출력
		for(i=1;i<=10;i+=2) { 
			System.out.print(i);
		}
			//선언 => 조건 비교 => 출력 => 증감 => 조건비교 => 출력		}
			
		System.out.println("");
		
		// 거꾸로 숫자
		for (i=5;1<=i;i--) {
				System.out.print(i);
			}
			
		System.out.println("");
		
		//1부터 10까지의 수들의 합
		int sum=0;
		for (i=1;i<=10;i++) {
			sum += i;
			System.out.println("현재까지 총 합은 "+ sum +"입니다.");
		}
		System.out.println("1부터 10까지의 모든 합은 "+ sum + "입니다" );
	
	}
}
package chap02;

import java.util.*; // 1. import문 추가

public class scann {
	public static void main(String[] args) {
		// Scanner란 ?  화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
		
		// Scanner를 사용하려면 ? 
		// 1. import문 추가 (import java.util.*)
		
		// 2. Scanner객체의 생성 ? (System.in = 화면 입력)
		// = (Scanner scanner = new Scanner(System.in); 
		
		// 3. int num = scanner.nextInt() = 화면에서 입력받은 정수를 num에 저장
		// 3-1. String input = scanner.nextLine(); // 화면에서 입력받은 내용을 input에 저장
		// 3-2. input = input + num;
		// 3-3. int num = Integer.parseInt(input); // 문자열(input)을 정수형(num)으로 형변환  
		
		Scanner scanner = new Scanner(System.in); // Scanner 사용 가능 (객체 생성)
//		int num1 = scanner.nextInt(); // 정수형 형태로 값을 입력
//		int num2 = scanner.nextInt(); 
//		System.out.println(num1);
//		System.out.println(num2);
		
//		String input = scanner.nextLine(); // nextLine()메소드는 Enter를 치기 전까지 쓴 문자열 모두 리턴
//		String input2 = scanner.next(); // next()메소드는 공백전까지 문자열 리턴
//		int num = Integer.parseInt(input); // 문자열을 정수형으로 형변환
//		
//		System.out.println(num);
		
		//nextInt()메소드를 실행 할 때 20을 콘솔에 입력하고 엔터를 누를때 20을 리턴시켰지만 Enter값은 그대로 남아있다. 
		//nextLine() 메소드는 Enter값을 기준으로 메소드를 종료시키기 때문에 
		//nextLine()메소드가 실행될 때 남아있는 Enter값을 그대로 읽어 바로 종료된 것이다.

//	      System.out.println("첫번째 정수입력: ");
//	        int i = scanner.nextInt();
//	        System.out.println(i);
//
//	        System.out.println("첫번째 문자열입력: ");
//	        String str1 = scanner.nextLine();
//	        System.out.println(str1);
//	        
//	        System.out.println("두번째 정수입력: ");
//	        int j = scanner.nextInt();
//	        System.out.println(i);
//	        
//	        System.out.println("두번째 문자열입력: ");
//	        String str2 = scanner.next();
//	        System.out.println(str2);

		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('a' + 'b');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J'+ "ava");
//		System.out.println(true + null);
		
		
		
		
		
	}
}

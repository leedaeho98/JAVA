package java_23_03_14;
import java.util.*;
public class CallMethod {
	
	public static void main(String[] args) {
		/* 메서드의 실행흐름
			1. 클래스를 연결하는 인스턴스를 생성
			2. 메서드를 호출한다
			3. 호출해서 대입한 값을 메서드 매개변수 값에 대입 후 아래 문장이 실행 되고 return문을 만나면 메인메서드로 돌아와서 실행
		
		*/
		MyMath me = new MyMath(); //객체 생성
		
		// 반환값이 있는 메서드
		int result = me.add(3,5); // => 메서드호출 및 작업결과를 저장할 변수 생성
		System.out.println("반환값이 있는 메서드 : " + result);
		
		// 반환값이 있는 메소드
		long result1 = me.append(5, 9); // 메서드에 실행한 값을 result1에 대입
		long result2 = me.append(5, 9);
		long result3 = me.append(5, 9);
		long result4 = me.append(5, 9);
		
		System.out.println("one(5L, 9L) = " + result1);
		System.out.println("two(5L, 9L) = " + result2);
		System.out.println("three(5L, 9L) = " + result3);
		System.out.println("four(5L, 9L) = " + result4);
		// 반환값이 없는 메서드
		me.print99danAll(8, 3);
		
		int money1 = me.BigValue(0,0);
		System.out.println("더 높은 값은 : " + money1);
		
		int money2 = me.SmallValue(0, 0);
		System.out.println("더 낮은 값은 : " + money2);
		
	}
	
}
	
// 메서드 호출
class MyMath{
	Scanner sc = new Scanner(System.in);
	// 반환값이 있는 메서드
	// 메인에서 대입한 값을 메서드 매개변수에 대입한 뒤 아래 문장 실행 후 메인으로 리턴
	int add(int x, int y) { 
	int result = x + y;
	return result; // 메인으로 반환
	}
	
	// 반환값이 없는 메서드
	 void print99danAll(int x, int y) { // 반환값이 없음
		int result = x*y;
		System.out.println("반환값이 없는 메서드 " + result);
		return;
	}
	long append(long a , long b) {
		long result = a + b;
		return result;
	}
		
//두 값을 입력받아서 둘중에 큰 값을 반환하는 메서드를 작성
	int BigValue(int x , int y) {
		int result = 0;
		System.out.print("두 값을 입력받아서 더 큰 값을 출력 : ");
			x=sc.nextInt();
			y=sc.nextInt();

			result = x > y ? x : y;
		return result;
	}
	
	int SmallValue(int x , int y) {
		int result = 0;
		System.out.print("두 값을 입력받아서 더 작은 값을 출력 : ");
			x = sc.nextInt();
			y = sc.nextInt();
			result = x>y ? y : x;
				
		return result;
	}
	
}
	
		
		

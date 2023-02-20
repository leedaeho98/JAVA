package chap_07;

public class WhenToUse {
	//메소드 필요 이유 = 
	//비슷한 동작을 하는 코드들을 or 같은 동작을 하는데 값만 바뀌는거면 
	//메소드로 간단하게 수정 및 코드간소화가 가능하다 
//	public static int getNumber(int number , int exponent) {
//	int result = 1;
//	for (int i = 0 ; i < exponent ; i++) {
//	result *= number;
//	}
//	return result;
//	}
	public static int getParmater(int number) {
		int result = number * number;
		return result;
	}
	
public static void main(String[] args) {
	System.out.println(getParmater(3));
	
//	System.out.println(getNumber(4,2));
	
//	int result = 1;
//	for (int i = 0 ; i < 2 ; i++) {
//	result *= 2;
//	}
//	System.out.println(result);
//	int sum = 1;
//	for (int i = 0 ; i< 3 ; i++) {
//	sum *= 3;
//	}
//	System.out.println(sum);
//
//	sum = 1;
//	for (int i = 0 ; i< 2 ; i++) {
//	sum *= 4;
//	}
//	System.out.println(sum);

}
}


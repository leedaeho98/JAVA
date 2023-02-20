package chap_02;

public class page4논리 {
public static void main(String[] args) {
	//논리 연산자
	boolean 김치찌개 = true;
	boolean 계란말이 = true;
	boolean 제육볶음 = true;
	
	System.out.println(김치찌개 || 계란말이 || 제육볶음); // ||(or:또는)하나라도 true면은 true
	System.out.println(김치찌개 && 계란말이 && 제육볶음); // &&(and:그리고)모든 값이 true여야 true
	
	System.out.println((5 > 3) && (5 < 3)); //5는 3보다 크고 3은 5보다 크다 false(&&)
	System.out.println((5 > 3) && (3 > 1)); //5는 3보다 크고 3은 1보다 크다 true(&&는 모든 식이 true면  true)

	System.out.println((5 > 3) || (5 < 3)); // 5는 3보다 크고 3은 5보다 크다 true(||: 하나라도 값이 true면은 true)
	System.out.println((5 > 3) || (3 < 1)); //true
	System.out.println((5 < 3) || (3 < 1)); //하나라도 true가 없어서 false

//	System.out.println(1 < 3 < 5); //연속된 비교는 X
	
	System.out.println(!true); //false (true의 반대)
	System.out.println(!false); //true (false의 반대)
	System.out.println(!(5 == 5)); //같으니까 false
	System.out.println(!(5 == 3)); //같지 않으니까 true
}
}

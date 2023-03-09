package chap02;

public class value_change {
	public static void main(String[] args) {
		//두 변수의 값 교환
		Integer i = 10;
		Integer j = 20;
		Integer k = 0;
		
		k = i; // k의 값은 10 , i의 값도 10 
		i = j; // i의 값은 20 , j의 값도 20
		j = k; // j의 값은 10 , k의 값은 10 
		
		
		System.out.printf("%d %d",i,j); // 값 교환
	}
}

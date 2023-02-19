package chap_02;

public class page2대입 {
public static void main(String[] args) {
	//대입 연산자
	int num = 10;
	num = num + 2;
	System.out.println(num); //12
	
	num = num - 2;
	System.out.println(num); //10
	
	num = num * 2;
	System.out.println(num); //20
	
	num = num / 2;
	System.out.println(num); //몫 10
	
	num = num % 2;
	System.out.println(num); //나머지 0
	
	//복합 대입 연산자
	num=10;
	num += 2; //num = num + 2 축약
	System.out.println(num);
	
	num -= 2;
	System.out.println(num);
	
	num *=2;
	System.out.println(num);
	
	num /=2; //몫을 구함 10
	System.out.println(num);
	
	num %=2; //나머지 구함 0
	System.out.println(num);
}
}

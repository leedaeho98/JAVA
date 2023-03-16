

package java_23_03_16;

import java.lang.reflect.Array;
import java.util.Arrays;

//class Data_1{
//	int value; // 컴파일러가 기본생성자 자동추가
//}
//
//class Data_2{
//	int value;
//	
//	Data_2(){} // 매개변수 생성자를 넣으려면 기본생성자를 만들어야함
//	Data_2(int x){ // 매개변수가 있는 생성자
//		value = x;
//	}

class Car{
	String color;
	String gearType;
	int door;

	Car(){} // 기본생성자
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
}
}
public class Constructor {
	public static void main(String[] args) {
//		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2(); // compile error발생
		Car c = new Car("빨강","5단",4); // 객체 초기화
		
	}
	
}

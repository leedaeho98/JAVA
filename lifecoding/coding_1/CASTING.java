package coding_1;

public class CASTING {
	public static void main(String[] args) {
		
		// 캐스팅 = 자바에서는 변수의 데이터 타입을 엄격하게 통제
		//자바를 사용하다 보면 어떤 변수의 들어갈 값 , 변수에 들어있는 값
		//다른 데이터 타입으로 컨버팅해야할 경우가 생기는데 그때의 키워드가 캐스팅
		// 어디서 어디로 무엇을 무엇으로 캐스팅 하고 싶은지 알면 검색을 통해서 알수있다
		
		double a = 1.1; // 실수형
		double b = 1; //손실이 없기 때문에 자동으로 캐스팅
		double b2 = (double)1; 
		
		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1; //0.1 손실이 일어나기 때문에 캐스팅 x
		int e = (int) 1.1; //double형을 integer형변환 (정수형)
		System.out.println(e);
		
		// 1(정수형) to String(문자열) 형변환
		String f = Integer.toString(1);
		System.out.println(f.getClass()); 
		// 정수형 1을 문자열 1로 형변환 시킴
		// getClass()는 변수의 데이터 타입이 어떤건지 알려줌
		
	}
}

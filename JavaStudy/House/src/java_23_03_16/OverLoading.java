package java_23_03_16;

public class OverLoading {
//	4-1 오버로딩이 성립하기 위한 조건
//	  1. 메서드 이름이 같아야 한다
//	  2. 매개변수의 개수 또는 타입이 달라야 한다
//	  3. 반환 타입은 영향없다
	// 오버로딩x 중복정의이므로 에러
//	int add (int a, int b ) {return a + b;}
//	int add (int x, int y ) {return x + y;}
//	int add (int a, int b ) {return a + b;}
//	long add (int x, int y ) {return (long)(x + y);}
	
	// 오버로딩 올바른 예제
	// ambiguous있는 에러가 뜨면 메소드 어떤걸 부를지 확실하지 않아서다
	int add(int a, int b) {
		System.out.println("int add(int a, int b) - ");
		return a+b;
		
	}
	// long타입의 오버로딩
	long add(long a, long b) {
		System.out.print("long add(int a, int b) - ");
		return a+b;
		
	}
	
	// 배열의 오버로딩
	int add(int[] a) {
		System.out.println("int add(int a[] a) - ");
		int result = 0;
		for(int i = 0 ; i < a.length ; i++) {
			result += a[i];
		}
		return result;
		
	}
	public static void main(String[] args) {
		
		OverLoading over = new OverLoading();
		int result = over.add(3, 5);
		System.out.println(result);
		
		result = over.add(500000, 500000);
		System.out.println(result);
		
		int a[] = {100,200,300};
		System.out.println(over.add(a));
	}

}

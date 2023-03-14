package libexam02;

public class StringLibExam03 {
	
	public static void main(String[] args) {
		// int k = 4; int l = 4; k== l (true)
		// String is = new String("aa"), String js =new String("aa") is == js (false) 
		String is = new String("aa");
		String js = new String("aa");
		System.out.println(is + "             " + js);
		System.out.println(is == js); // 
		System.out.println(is.equals(js)); // 모든 객체를 비교할 때에는 equals로 비교한다
		// == 상자의 자료(값)를 비교한다. 
		
		DataObj obj1 = new DataObj(); // DataObj클래스 객체 생성
		System.out.println(obj1.aaa + ",       " + obj1.bbb+ ",        "+ obj1.ccc);
		
		DataObj obj2 = new DataObj();
		obj2.ccc = 32580; 
		System.out.println(obj2.aaa + ",       " + obj2.bbb + ",        "+obj2.ccc);
		
		
		System.out.println("비교 결과" + (obj1 == obj2)); // 주소 비교
		System.out.println("비교 결과" + (obj1.equals(obj2))); 
		// 오브젝트에 있는 equals는 비어있다 그러므로 실제 값 비교를 하려면 equals를 재정의 해야한다(hashcode and equals)
		// hashcode and equals에서는 c의 값이 달라도 aaa와 bbb만 비교하기 때문에 true가 나온다 => 
	}
}

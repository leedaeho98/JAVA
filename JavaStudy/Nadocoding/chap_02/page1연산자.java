package chap_02;

public class page1연산자 {
	    public static void main(String[] args) {
	        //산술 연산자

	        //일반 연산
	        System.out.println(4 + 2); //6
	        System.out.println(4 - 2); //2
	        System.out.println(4 * 2); //8
	        System.out.println(4 / 2); //몫을 구하는 식 2
	        System.out.println(5 / 2); //인트형이므로 2가 출력
	        System.out.println(2 / 4); //정수형이므로 0 출력
	        System.out.println(4 % 2); //나머지 연산자 2
	        System.out.println(5 % 2);
	        
	        //우선 순위 연산
	        System.out.println(2 + 2 * 2); //6
	        System.out.println((2 + 2 )* 2); //8
	        System.out.println(2 + (2 * 2)); //6
	        
	        //변수를 이용한 연산
	        int a =20;
	        int b =10;
	        int c;
	        
	        c = a + b;
	        System.out.println(c); //30
	        
	        c = a - b;
	        System.out.println(c); //10
	        
	        c = a * b;
	        System.out.println(c); //200
	        
	        c = a / b;
	        System.out.println(c); //몫 2
	        
	        c = a % b;
	        System.out.println(c); //나머지 0
	        
	        //증감 연산 ++,--
	        int val;
	        val = 10;
	        System.out.println(val);
	        System.out.println(++val); //증감 후 출력
	        System.out.println(val);
	       
	        val = 10;
	        System.out.println(val); //출력 후 증감 다음 출력문에 증감된거 나옴
	        System.err.println(val++);
	        System.out.println(val++);
	        System.out.println(val);
	        
	        val=10;
	        System.out.println(val);
	        System.out.println(--val); //감소 후 출력
	        System.out.println(val);
	        
	        System.out.println("-----------");
	        val=10;
	        System.out.println(val);
	        System.out.println(val--);
	        System.out.println(val);
	        
	        //은행 대기번호 표
	        int waiting = 0;
	        System.out.println("대기 인원 :"+ waiting++); //대기 인원 0
	        System.out.println("대기 인원 :"+ waiting++); //대기 인원 1
	        System.out.println("대기 인원 :"+ waiting++); //대기 인원 2
	        System.out.println("총 대기인원 : " +waiting); //총 대기인원 3
	    }
	}



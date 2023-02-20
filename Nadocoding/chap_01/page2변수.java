package chap_01;

public class page2변수 {
	    public static void main(String[] args) {
	        String name="나도코딩";
	        int time=15;
	        double score = 90.5;
	        char grade = 'A';
	        name="이대호";
	        grade = 'B'; //값을 업데이트 할수있다
	        boolean pass = true;
	        pass=false;        

	            System.out.println(name +", 배송이 시작됩니다. "+ time + "시에 방문 예정입니다");
	            //name + 문자열 + time + 방문예정이다가 더해진거다
	            System.out.println(name +", 배송이 완료되었습니다");
	            System.out.println(name+"님의 평균 점수는 "+ score +"점입니다.");
	            System.out.println("학점은 "+ grade +"입니다");
	            System.out.println("그래서 지금 개발자가 되었나요 "+pass+"");
	            
	            double g=3.14123456789;
	            float f =3.14123456789f; //float은 무조건 실수 값 뒤에 f를 넣어야한다
	            System.out.println(g+"입니다"); //보다 정밀한 소수 계산을 하면 double
	            System.out.println(f+"입니다");  //깊은 소수점을 안할거면 float
	            
	            long i = 1000000000000l; //long을 쓸려면 정수 값 뒤에 l을 붙여야한다
	            i=1000_000_000_000l;
	            System.out.println(i);

	            //int(정수형),long(정수형(int보다 더 값이 높음))
	            //float(실수형),double(실수형(float보다 값이 높음))
	            //char(문자(1글자)),String(문자열(여러글자))
	            //boolean(true,false)

	            //사용하려는 데이터에 맞는 적합한 자료형을 사용해야한다
	            //int형이 가질수 있는 최소의 값은 -21억 +21억이다
	    }
	}



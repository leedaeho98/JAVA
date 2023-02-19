package chap_01;

public class page5형변환 {
	    public static void main(String[] args) {
	        // 형변환 TypeCasting
	        // 정수형에서 실수형으로
	        // 실수형에서 정수형으로

	        // int to float, double
	        // int score = 93 + (int)98.8; //98.8 앞에 int형으로 형변환 시킨다
	        // System.out.println(score);

	        int score =93;
	        System.out.println(score); //93
	        System.out.println((double) score); //변수 앞에 double을 넣으면 실수로 형변환한다(93.0)
	        System.out.println((float) score); //형변환

	        //float,double to int
	        float score_f = 93.3F;
	        double score_d = 93.3;
	        score_d=98.8;
	        System.out.println((int) score_f); //int형으로 형변환
	        System.out.println((int) score_d); //98

	        //정수 + 실수 연산
	        score = 93 + (int)98.8; //값 앞에 자료형을 넣으면 된다
	        System.out.println(score); //191

	        //실수 + 정수 연산
	        score_d=(double) 93+98.8; //결과값이 실수형이 들어가면 93은 자동으로 형변환 된다
	        System.out.println(score_d);

	        //뱐수에 형변환된 데이터 집어넣기
	        double converedScoreDouble = score; //score=191 -> 191.0 (자동형변환)
	        // int -> long -> float -> double (자동형변환)

	        int convertedScoreInt = (int)score_d;  //큰 범위에 있는 데이터를 작은 데이터 범위에 담을려 해서 오류나는거다 그러므로 형변환!!!
	        // double -> float -> long -> int (수동형변환)

	        //숫자를 문자열로
	        String s1 = String.valueOf(93); //클래스(스트링)에 제공해주는 valueOf 기능을 사용해 93정수를 문자열로 바꾼다
	        s1 = Integer.toString(93); //위와 같은 방법이다
	        System.out.println(s1); //문자열이다

	        String s2 = String.valueOf(99.9);
	        s2 = Double.toString(98.8);
	        System.out.println(s2);

	        // 문자열을 숫자로
	        int i = Integer.parseInt("95");
	        System.out.println(i);

	        double d = Double.parseDouble("98.8");
	        System.out.println(d);

	        //데이터가 올바르게 들어가있어야한다
//	        int error = Integer.parseInt("자바");
//	        System.out.println(error);
	        


	    }
	}


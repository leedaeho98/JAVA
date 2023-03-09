	package libexam02;
import java.util.*;
public class IfExam {
	public static void main(String[] args) {
		// 점수를 입력받아서 60점 이상이면 pass 60점 미만일경우 fail 출력하는 프로그램을 작성하시오
		int jumsu = 64;
		
		if (jumsu >= 60) System.out.println("pass");
		if (jumsu < 60) System.out.println("Fail");
		
		// 점수를 입력받아서 수우미양가를 출력하는 프로그램을 작성하시오
		// 점수를 입력받아서 A+ AO B+ BO.... F학점으로 출력하는 프로그램을 작성하시오
		
		if (jumsu >= 90 && jumsu <= 100) System.out.println("수");
		if (jumsu >= 80 && jumsu < 90) System.out.println("우");
		if (jumsu >= 70 && jumsu < 80) System.out.println("미");
		if (jumsu >= 60 && jumsu < 70) System.out.println("양");
		if (jumsu < 60) System.out.println("가");
		
		String pg = "가 가 가 가 가 가 양 미 우 수 수";
		System.out.println(pg.split("\\s+")[jumsu/10] );
		
		String pge = "F F F F F F F F F F F F F D0 D+ C0 C+ B0 B+ A0 A+ A+";
		System.out.println(pge.split("\\s+")[jumsu/5] ); // /5 - 10 결과값이 음수가 나오면 에러
		
	}
}

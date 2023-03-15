package java_23_03_04;


import java.util.*;

public class elif {

	public static void main(String[] args) {
		//else if 및 중첩 if문
		//중첩 if문은 중첩횟수 제약이 없다.
		//학점
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int Student = sc.nextInt();
		String grade = null;
		
		if ( Student >= 90 ) {
			if (Student > 98) {
			grade="A++";
			}else if(Student > 94 ) {
			grade="A";
			}else {
			grade="A-";
			}
		}else if(Student >= 80){ 
			grade="B";
		
		}else if (Student >= 70){
			grade="C";
		}else {
			grade="D";
		}
		System.out.println("당신의 학점은 " + grade);
		
	}

}

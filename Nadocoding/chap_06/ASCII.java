package chap_06;

public class ASCII {
	public static void main(String[] args) {
		//아스키 코드 (ANSI) : 미국 표준코드
		char c = 'A'; //알파벳 대문자(A)는 65부터 시작 , 소문자는(a) 97부터 시작 , 숫자는(0) 48부터 시작
		System.out.println(c);
		System.out.println((int)c); //정수형으로 형변환 아스키코드 10 진수로 65다
		
		c = 'B';
		System.out.println(c);
		System.out.println((int)c); //정수형으로 형변환 아스키코드 10진수로 66
		
		c++;
		
		System.out.println(c);
		System.out.println((int)c); //정수형으로 형변환 아스키코드 10진수로 66
	
		
		System.out.println("-------------------");
		String[][] seats3 = new String[10][15];
		char ch = 'A';
		for (int i = 0 ; i<seats3.length;i++  ) {
			for (int j = 0; j < seats3[i].length ; j++) {;
				seats3[i][j] = String.valueOf(ch) + (j+1);
				//문자형인 ch를 문자열로 변환
			}
			ch++;
		}
		System.out.println("-------------------");
		
		seats3[7][8] = "__"; //배열을 공백으로
		seats3[7][9] = "__";
			for (int i = 0 ; i<seats3.length;i++  ) {
				for (int j = 0; j < seats3[i].length ; j++) {
			System.out.print(seats3[i][j] + " ");
			}
			System.out.println();
		}

	}
}

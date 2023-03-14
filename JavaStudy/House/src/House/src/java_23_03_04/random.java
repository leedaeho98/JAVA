package java_23_03_04;
public class random {
	//임의 정수 만들기 => Math.random()
	public static void main(String[] args) {
		
		// 임의읜 난수들이 만들어진다
		for (int i = 1 ; i<= 20 ; i++) {
			System.out.println((int)(Math.random()*11)-5); // 1~20의 난
		}
		
	}
}

package libexam02;

public class StringLibExam01 {
	public static void main(String[] args) {
		StringBuffer sb01 = new StringBuffer(100);
		System.out.println(sb01.capacity()); //
		sb01.append("qwertyuiopasdfghjklzxcvbnm");
		System.out.println(sb01.capacity());
		
		System.out.println("=========================================");
		
		StringBuffer sb02 = new StringBuffer("qwertyuiopasdfghjklzxcvbnm");
		System.out.println(sb02.capacity()); //

		System.out.println("=========================");
		
		sb02.trimToSize();
		System.out.println("trimToSize 후의 캐파 => " + sb02.capacity());
		System.out.println(sb02);
		System.out.println(sb02.toString());
		System.out.println(sb02.reverse());
		System.out.println("String Buff(builder)타입문자열을 String type으로 변환하는 다양한 방법");
		String newsb = sb02 + "yangdoll";
		
		System.out.println(sb02+"");
		System.out.println(sb02.toString());
		System.out.println(new String(sb02));
		System.out.println("========================");
		
		
		String sourceData = "abcdefg";
//		sourceData.reverse();
		String reversData = new StringBuilder(sourceData).reverse().toString();
		System.out.println("StringBulider를 이용한 문자열 리버싱 =>" + reversData);
		int strCnt=reversData.length();
		StringBuffer revTarget = new StringBuffer();

		// DB에 저장할 때 이 방식을 사용한다
		for (int i = 0 ; i < strCnt; i= i+1) {
			revTarget.append(sourceData.charAt(strCnt-1-i));
			revTarget.append(sourceData.charAt(i));
		}
		System.out.println( revTarget.toString() + "\n=====================");
		
		System.out.println("=================원자료로의 복원=======================");
		StringBuffer recData = new StringBuffer();
		int revLen = revTarget.length();
		for (int i = revLen-2 ; i >= 0  ; i = i-2) {
			recData.append(revTarget.charAt(i));
		}
		System.out.println(recData);
		
		
//		for (int i = strCnt-1 ; i >= 0 ; i= i-1) {
//			System.out.print(sourceData.charAt(i));
//		}
//		System.out.println("");
	}
}

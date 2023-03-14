package libexam04;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class DateExam02 {
	
	public static void main(String[] args) {
		Date now = new Date();
//		System.out.println("현재 시스템에 설정된 날짜와 시간 " + now);
//		System.out.println(now.getYear() + 1900 + "년");
//		System.out.println(now.getMonth()+1 + "월");
//		System.out.println(now.getDate() + "일");
//		System.out.println(now.getDay() + "일");
//		System.out.println(now.getTime() + "");
		
		// 1970 1월 1일 0시 0분 0초 부터 몇일째 되는날인가 ... 오늘이
		
		Calendar cal = Calendar.getInstance(); // 내가 원하는 날짜데이터를 얻읋수있다
		System.out.println("calendar => " + cal);
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(+cal.get(Calendar.YEAR) +"년도" +cal.get(Calendar.MONTH) + "월" +cal.get(Calendar.DATE) + "일" );
		
		System.out.println("============== 형식 지정 출력 =================");
		System.out.println();
		System.out.print(129  + "\n");
		System.out.printf("%ta %tb %td %tT %tZ %tY",now,now,now,now,now,now);
		System.out.printf("%1$ta %1$tb %1$td일 %1$tT %1$tZ %1$tY", now);
		
		System.out.println("============== 중복이 허락되지 않는 ID발급 ==============");
		System.out.println(UUID.randomUUID());
		
	}
}

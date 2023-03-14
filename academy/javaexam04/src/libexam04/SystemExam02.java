package libexam04;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class SystemExam02 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int sum = 0;
		for (int i = 10; i < 50 ; i = i+1 ) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(System.nanoTime() - startTime); //성능을 평가한다
		System.out.println("====================================");
		
//		System.exit(1); // 프로그램을 종료버튼
		
		
		Map<String, String> envInfo = System.getenv(); // 환경설정정보 및 들어가는 설정들
		Iterator<String> iter = envInfo.keySet().iterator();
		while( iter.hasNext()) {
			String envName = iter.next(); // 키 값을 얻어온다
			System.out.println(envName + " : " + envInfo.get(envName) ); // 키 값 안에 있는 데이타를 출력
		}
		
		StringBuffer sb = new StringBuffer("나일등");
		sb.append("맹구");
		sb = null; // 전 데이타를 안쓴다고 재정의
		sb = new StringBuffer("땡질이!!");
		
		
		//Iterator에 구버전
		System.out.println("=== 시스템에 등록되어 있는 속성 정보 보기 ===");
		Properties props = System.getProperties();
		props.propertyNames();
		Enumeration<String> proEnums = (Enumeration<String>) props.propertyNames(); // 형변환을 시켜준다
		while (proEnums.hasMoreElements()) {
			String proName = proEnums.nextElement();
			System.out.println(proName + " : " + props.get(proName) ); // 키 값 안에 있는 데이타를 출력
		}
	}
}

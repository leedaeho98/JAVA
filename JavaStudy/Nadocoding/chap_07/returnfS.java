package chap_07;

public class returnfS {
	//호텔 전화번호 (반환)
	public static String getPhoneNumber() {
	String phonNumber = "02-1234-5678";
	return phonNumber;
	}
	//호텔 주소 값을 메인으로 반환
	public static String getaddress() {
	return "서울시 어딘가";
	}
	//호텔 액티비티
	public static String getActivities() {
	return "그네 , 짚라인 , T익스프레스 ";
	}
	
	public static void main(String[] args) {
		
	//반환 값
	String contactNumber = getPhoneNumber();
	System.out.println("호텔 전화번호 : "+contactNumber);
	
	String Address=getaddress(); //위 함수에 값을 메인으로 반환해서 	새 변수에 넣고 출력
	System.out.println("고객님의 주소는 : " + Address);

	System.out.println("호텔 액티비티 : " + getActivities());
	}
}

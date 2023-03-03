package chap_07;

//함수 선언

public class __Quiz3 {
	public static String getHiddenData(String data , int index) {
		String hiddenData = data.substring(0,index); // 나코딩 -> 나 **
		for (int i = index ; i< data.length() ; i++) {
//		for (int i = 0; i < data.length()- index; i++){
			hiddenData += "*";
		}
		return hiddenData;

	}
	
	public static void main(String[] args) {
	String name = "나코딩";
	String number = "990130-1234567";
	String phone = "010-1234-5678";
	
	System.out.println("이름 : " + getHiddenData(name,1) );
	System.out.println("이름 : " + getHiddenData(number,8) );
	System.out.println("이름 : " + getHiddenData(phone,9) );
	
}

}

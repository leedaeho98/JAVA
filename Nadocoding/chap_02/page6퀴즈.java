package chap_02;

public class page6퀴즈 {
public static void main(String[] args) {
	//편의점에서 구매를 해야하는 상황
	int man = 5000;
	String price = (6000 <= man) ? "살 수 있습니다!!" : "부족합니다";
	System.out.println("이 물건은 " +man+ "원으로 " + price);
}	
}

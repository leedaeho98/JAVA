package chap_07;

public class return2 {
	// ���ް��� ��ȯ���� �ִ� �޼ҵ�
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
	public static int getPowerObject(int Postion, int exponent) {
		int result = 1;
		for (int i = 0 ; i < exponent ; i++ ) {
		result *= Postion;
		}
		return result;
	}
	
	public static void main(String[] args) {
	int retVal=getPower(2);
	System.out.println(retVal);
	
	retVal = getPower(3);
	System.out.println(retVal);
	
	int Option=getPowerObject(3,3); //�Լ����� ���� ���� �� �ٽ� �������� ��ȯ �� ���
	System.out.println(Option);
	
	Option = getPowerObject(2,4);
	System.out.println(Option);
}
}

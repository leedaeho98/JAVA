package chap_07;

public class overloading {
	// �޼ҵ� �����ε�
	// ���� �̸��� �޼ҵ带 ���� �� ����
	// 1. ���ް��� Ÿ���� �ٸ��ų�
	// 2. ���ް��� ������ �ٸ��ų�
	// 3. ��ȯ���� �ٸ� ���·δ�  �޼ҵ带 �ߺ� ���� �Ұ���
	
	public static int getPower(int number) { //Parameter,  �Ű�����
		int result = number * number;
		return result;
	}
	
	public static int getPower(String strNumber) {
		int number = Integer.parseInt(strNumber); // ���ڿ��� ���¸� ���������� ��ȯ
		return number * number;
		
	}
	public static double getPower(double douNumber) {
		double number = douNumber;
		return number * number;
	}
		
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent ; i++) {
			result *= number;
		}
		return result;
	}
	public static void main(String[] args) {
		//�޼ҵ� �����ε� = �̸��� ���� �Լ����� �ڷ����� ���°� �ٸ��� �� ���� ���缭 ���
		System.out.println(getPower(3));	// 3 * 3 = 9
		System.out.println(getPower("4")); //���ڿ������� ��Ƽ���� ����ȯ �������Ƿ� ������ ����
		System.out.println(getPower(3.14));
		System.out.println(getPower(2,3));
	}

}

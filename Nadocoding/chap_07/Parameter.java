package chap_07;

public class Parameter {
	//���ް� , Parameter
	//���ް��� �ִ� �޼ҵ�
	public static void power(int number) { //Parameter,  �Ű�����
		int result = number * number;
		System.out.println(number + " �� 2���� " + result);
	}
	public static void powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent ; i++) {
			result *= number;
		}
		System.out.println(number + "��" + exponent + " ���� " + result);
	}
	
	
	public static void main(String[] args) {
	// Argument , �μ�	
	power(2); // ���� ������ ������ ���������Ƿ� �����Ϸ��� ���� ���´�	
	power(3); // 3 * 3 = 9
	powerByExp(2, 3); //�� �Լ��� ���� ���޵ȴ� �׸��� ���
	powerByExp(3, 4);
	powerByExp(10, 0);
	
	}

}

package chap_07;

public class WhenToUse {
	//�޼ҵ� �ʿ� ���� = 
	//����� ������ �ϴ� �ڵ���� or ���� ������ �ϴµ� ���� �ٲ�°Ÿ� 
	//�޼ҵ�� �����ϰ� ���� �� �ڵ尣��ȭ�� �����ϴ� 
//	public static int getNumber(int number , int exponent) {
//	int result = 1;
//	for (int i = 0 ; i < exponent ; i++) {
//	result *= number;
//	}
//	return result;
//	}
	public static int getParmater(int number) {
		int result = number * number;
		return result;
	}
	
public static void main(String[] args) {
	System.out.println(getParmater(3));
	
//	System.out.println(getNumber(4,2));
	
//	int result = 1;
//	for (int i = 0 ; i < 2 ; i++) {
//	result *= 2;
//	}
//	System.out.println(result);
//	int sum = 1;
//	for (int i = 0 ; i< 3 ; i++) {
//	sum *= 3;
//	}
//	System.out.println(sum);
//
//	sum = 1;
//	for (int i = 0 ; i< 2 ; i++) {
//	sum *= 4;
//	}
//	System.out.println(sum);

}
}


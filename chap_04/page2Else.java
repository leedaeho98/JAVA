package chap_04;

public class page2Else {
public static void main(String[] args) {
	//���ǹ� else��
	int hour = 10;
	if (hour > 14) {
		System.out.println("���̽� �Ƹ޸�ī�� +1");
	} else { 
		System.out.println("��ī���� +1");
	//ù ������ �����̸� else�� ��� ��
	}
	System.out.println("Ŀ�� �ֹ� �Ϸ� #1");
	
	hour = 15;
	boolean morningCoffee = false;
	
	//���� 2�� �����̰ų� ��� Ŀ�Ǹ� ���� ���?
	if ( hour < 14 || morningCoffee == true ) {
		System.out.println("���̽� �Ƹ޸�ī�� (��ī����) +1");
	
	} else { //�� ���� ����
		System.out.println("���̽� �Ƹ޸�ī�� +1");
	}
	System.out.println("Ŀ�� �ֹ��Ϸ� #2");
  }
}

package chap_04;

public class page1if�� {
public static void main(String[] args) {
	//���ǹ� If
	//if (���ǹ�) {println("���϶� ��"} {}�߰�ȣ�� if���� ������ ���Ѵ�
	//if �� ������ �ϳ��� ������ ������ {�߰�ȣ] ���� ����
	int hour = 14;
	
	
	//if �� ������ 2�� �̻��� ������ ������ ���� {} ���� �Ұ�
	if (hour < 14) {
	System.out.println("���̽� �Ƹ޸�ī�� +1");
	System.out.println("�� �߰�");
	System.out.println("�ֹ� �Ϸ�!");
	}
	//���� 2�� ���� , ��� Ŀ�Ǹ� ������ ���� ���
	
	//&& �������� �� ���� �����ؾ� �Ѵ�
	//���� �������� �����Ƿ� if�� �տ� �ִ� ��¹��� ���� x
	hour = 13;
	boolean morningCoffee = false; //���Ŀ��
	//�����������ڸ� false ���� �ݴ��� true�� ������ ���� ���
	if (hour < 14 && !morningCoffee) {
		System.out.println("���̽� �Ƹ޸�ī�� +1");
	}
	System.out.println("Ŀ�� �ֹ� �Ϸ�#2");
	
	//���� 2�� �̰ų� ��� Ŀ�Ǹ� ���� ���?
	hour = 10;
	morningCoffee = true;
	if (hour >= 14 || morningCoffee) {
		System.out.println("��ī���� +1");
	}
	System.out.println("Ŀ�� �ֹ� �Ϸ�#3");
		
	
	}
}

	

package chap_04;

public class page4switch {
	public static void main(String[] args) {
		
	//Switch case
	
	//������ ���� ���б� ����
	//1�� : ���� ���б�
	//2�� : �ݾ� ���б�
	//3�� : �ݾ� ���б�
	//�� �� : ���б� ��� �ƴ�
	
	//if ���� �̿��� ��(���� ���� �Ǵ� ������ �ش��ϴ� ����)
	int i =1;
	if (i == 1) {
		System.out.println("�������б� ����");
		
	}else if( i == 2 || i == 3){
		System.out.println("�ݾ����б� ����");		
	} else {
		System.out.println("���б� ��� x");
	
	}
	System.out.println("��ȸ �Ϸ�#1");
	
	int ranking = 1; 
	switch (ranking+2) // switch(����)(��Ȯ�� ���̽��� �ִ� ���)
	{
	case 1: System.out.println("�������б� ����");
	break;
	//break�� ���� ���̸� ���忡�� �������´�
	//�Ʒ� ������ ��� x
	
	case 2:
	case 3: System.out.println("�ݾ����б� ����");
	break;
	
	//default = �� ��� ���� �����̸� ���
	default: System.out.println("���б� ��� x");
	}
System.out.println("��ȸ �Ϸ�#2");

	int grade = 2; //���
	int price = 7000; //�⺻����
	
	switch (grade) {
	case 1:
		price+=1000;
		break;
	case 2:
		price-=1000;
		break;
	case 3:
		price-=2000;
		break;

	}
	System.out.println("�� ������ ����� "+ grade +"�̰� ������ "+ price +"�Դϴ�");
}
}

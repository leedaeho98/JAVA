package chap_05;

public class page3 {
	public static void main(String[] args){
	//�ð��� 4�ð� (�ִ� ����� 3����)
	//�Ϲ� ������ 5�ð� 2����
	//����� �� ������ ��� 50% ����
	//����� 10�ð� 15000��
	//���� ������ 5�ð� ����
		
	int time = 5; //�ð��� 5�ð�
	boolean smallCar = true; // �Ҹ��������� ��������� ���������� Ȯ��
	boolean yamiCar = false;
	int max = time *4000; //4������
	
	if (max > 30000) {
	max = 30000;
	}
	if (smallCar || yamiCar) {
		max = max/2; //����� �� ���������� ��� ������ ����� ������ ��ݿ� /2 (50%)
		}
	System.out.println("�����Ͻ� ����� "+ max + "�Դϴ�");
	}
}
